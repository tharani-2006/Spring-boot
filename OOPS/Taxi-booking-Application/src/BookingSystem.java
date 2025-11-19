import java.util.ArrayList;
import java.util.List;

public class BookingSystem {
    private List<Taxi> taxis;
    int bookingId = 1;

    BookingSystem(int taxiCount){
        taxis = new ArrayList<>();
        for(int i=1; i <= taxiCount; i++){
            taxis.add(new Taxi(i));
        }
    }

    private int calculateCharges(char pickup,char drop){
        int distance = Math.abs(pickup-drop) * 15;//converting to the kilometer
        int charges = 100;
        distance -= 5;
        charges += distance * 10;
        return charges;
    }

    Taxi findTaxi(char pickup,char pickupTime){
        List<Taxi> freeTaxis = new ArrayList<>();
        for(Taxi t: taxis){
            if(t.isFree(pickup,pickupTime)){
                freeTaxis.add(t);
            }
        }

        if(freeTaxis.isEmpty()){
            return null;
        }

        int minDistance = Integer.MAX_VALUE;
        for(Taxi t : freeTaxis){
            int dis = Math.abs(pickup - t.getCurrentSpot());
            minDistance = Math.min(minDistance,dis);
        }

        List<Taxi> taxiWithSameMinDistance = new ArrayList<>();
        for(Taxi t : freeTaxis){
            int dis = Math.abs(pickup - t.getCurrentSpot());
            if(dis == minDistance){
                taxiWithSameMinDistance.add(t);
            }
        }

        Taxi selected = taxiWithSameMinDistance.get(0);
        for(Taxi t : taxiWithSameMinDistance){
            if(t.getEarnings() < selected.getEarnings()){
                selected = t;
            }
        }
        return selected;
    }

    void bookTaxi(Customer c){
        Taxi selected = findTaxi(c.getPickUp(),c.getDrop());
        if(selected == null){
            System.out.println("No taxi is available");
        }

        int travelTime = Math.abs(c.getPickUp() - c.getDrop());
        int dropTime = c.getPickTime() + travelTime;
        int charges = calculateCharges(c.getPickUp(),c.getDrop());
        Booking booking = new Booking(bookingId, dropTime , charges , c);
        bookingId++;

        selected.assignBookings(booking);
        selected.setFreeTime(dropTime);
        selected.setEarnings(selected.getEarnings() + charges);
        selected.setCurrentSpot(c.getDrop());

        System.out.println("Taxi " + selected.getTaxiId() + " is allocated");

    }
    void displayTaxi(){
        for(Taxi t : taxis ){
            System.out.println("Taxi - " + t.getTaxiId() + " Earnings : " + t.getEarnings());
        }
    }
}
