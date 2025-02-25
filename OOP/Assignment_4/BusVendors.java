
/**
 * @author Oskar Sokol
 * @version v1.0
 */
import java.util.ArrayList;
public abstract class BusVendors
{   //Creates an ArrayList that stores trips for each vendor
    ArrayList<BusTrips> trips = new ArrayList<BusTrips>();
    //Boolean used to check for valid Id
    boolean validId;
    public BusVendors() {
        validId = false;
    }
    //Itterates through the ArrayList and prints out each trip
    public void getAllAvailableTrips() {
        for(int i=0;i<trips.size();i++) {
            System.out.println(trips.get(i));
        }
    }
    //Method for booking seats on each trip
    public void bookingTrips(Booking b) {
       for(int i=0;i<trips.size();i++) {
           //Checks if the Id of the booking is equal to any of the trip Ids
           if(trips.get(i).getId() == b.getId()){
               //Sets the validId to true if a valid Id is found
               validId = true;
               //Check to ensure the number of passengers isn't more than the max seats and less than 0
               if(trips.get(i).getNoOfSeats() >= b.getNoOfPassengers() && b.getNoOfPassengers() > 0){
                   //Changes the number of available seats by taking away the seats being booked
                   trips.get(i).setNoOfSeats(trips.get(i).getNoOfSeats() - b.getNoOfPassengers());
                   //Booking Succesful message if booking is succesful
                   System.out.println("-----Booking Succesful-----");
                   System.out.println("Number Of Passengers: " + b.getNoOfPassengers());
                   System.out.println("Trip Id: " + b.getId());
                   System.out.println("Total Cost: " + (b.getNoOfPassengers()*trips.get(i).getFare()));
                   System.out.println("-------------------\n\n");
                   //Prints out the trip details with the updated available seats
                   System.out.println(trips.get(i));
               }
               else{
                   System.out.println("Invalid number of passengers");
               }
           }
        }
        //Prints message if Id is invalid
        if(validId == false){
            System.out.println("Invalid trip Id");
        }
    }
}
