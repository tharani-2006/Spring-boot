import java.util.ArrayList;
import java.util.List;

public class Taxi {
    private int taxiId;
    private char currentSpot;
    private int freeTime;
    private int earnings;
    private List<Booking> bookings;

    Taxi(int id){
        this.taxiId = id;
        this.currentSpot = 'A';
        this.freeTime = 0;
        this.earnings = 0;
        this.bookings = new ArrayList<>();
    }

    public boolean isFree(char pickUp,char pickupTime){
        int travelTime = Math.abs(pickupTime - currentSpot);
        if(freeTime + travelTime <= pickupTime){
            return true;
        }
        return false;
    }

    public void assignBookings(Booking b){
        bookings.add(b);
    }
    public int getTaxiId() {
        return taxiId;
    }
    public char getCurrentSpot(){
        return currentSpot;
    }

    public int getFreeTime(){
        return freeTime;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public int getEarnings(){
        return earnings;
    }

    public void setFreeTime(int freeTime){
        this.freeTime= freeTime;
    }
    public void setEarnings(int earning){
        this.earnings = earning;
    }

    public void setCurrentSpot(char dropLocation){
        this.currentSpot = dropLocation;
    }
}
