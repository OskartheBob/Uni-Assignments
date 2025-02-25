
/**
 * @author Oskar Sokol
 * @version v1.0
 */
public class TravelIreland
{
    //main Method
    public static void main(String[] args) {
        //Creates an object with all the trip info stored
        BusEireann be = new BusEireann();
        //Prints out all the available trips
        be.getAllAvailableTrips();
        //Creates a booking object that stores the info of the booking
        Booking bookingBusEireann = new Booking(5454, 7);
        //Places a booking by running the bookingTrips method
        be.bookingTrips(bookingBusEireann);
        
        GoBus gb = new GoBus();
        gb.getAllAvailableTrips();
        Booking bookingGoBus = new Booking(8976, 5);
        gb.bookingTrips(bookingGoBus);
        
        CityLink cl = new CityLink();
        cl.getAllAvailableTrips();
        Booking bookingCityLink = new Booking(7452, 16);
        cl.bookingTrips(bookingCityLink);
    }
}
