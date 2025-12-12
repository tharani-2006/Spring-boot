import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException {

        List<Bus> buses = new ArrayList<Bus>();
        List<Booking> bookings = new ArrayList<>();

        buses.add(new Bus(1, true, 2));
        buses.add(new Bus(2, true, 5));

        for(Bus b : buses){
            b.displayBusInfo();
        }

        Scanner sc = new Scanner(System.in);
        int askInputOption=1;

        while(askInputOption == 1){
            System.out.println("Enter 1 to Boook and 2 to Exit");
            askInputOption = sc.nextInt();
            if(askInputOption == 1){
                Booking booking = new Booking();
                if(booking.isAvailable(bookings, buses)){
                    bookings.add(booking);
                    System.out.println("Booking success");
                }else{
                    System.out.println("Sorry bus is full, try another bus or data");
                }
            }
        }
    }
}