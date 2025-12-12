import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
    String passengerName;
    int busNo;
    Date date;

    Booking() throws ParseException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter passenger name : ");
        passengerName = sc.next();

        System.out.println("Enter BusNo : ");
        busNo = sc.nextInt();

        System.out.println("Enter date dd-mm-yyyy");
        String dateInput = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        date = dateFormat.parse(dateInput);
    }

    public boolean isAvailable(List<Booking> bookings, List<Bus> buses){
        int capacity = 0;
        for(Bus bus : buses){
            if(bus.getBusNo() == busNo){
                capacity = bus.getCapacity();
            }
        }

        int booked=0;
        for(Booking booking : bookings){
            if(booking.busNo == busNo && booking.date.equals(date)){
                booked++;
            }
        }

        return booked < capacity ? true : false;
    }
}
