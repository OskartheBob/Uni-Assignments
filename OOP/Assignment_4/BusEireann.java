
/**
 * @author Oskar Sokol
 * @version v1.0
 */
public class BusEireann extends BusVendors
{   //Constructor stores different available trips
    public BusEireann() {
        BusTrips trip1 = new BusTrips("Bus Eireann", 2121, "Galway", "Dublin", "11/2/24", "7:00", "11/2/24", "9:30", 50, 8.5f);
        BusTrips trip2 = new BusTrips("Bus Eireann", 5454, "Dublin", "Galway", "11/2/24", "7:00", "11/2/24", "9:30", 50, 8.5f);
        trips.add(trip1);
        trips.add(trip2);
    }
}
