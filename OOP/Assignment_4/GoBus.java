
/**
 * @author Oskar Sokol
 * @version v1.0
 */
public class GoBus extends BusVendors
{   //Constructor stores different available trips
    public GoBus() {
        BusTrips trip1 = new BusTrips("GoBus", 8976, "Ballinasloe", "Athenry", "13/5/24", "11:00", "13/5/24", "12:30", 50, 10f);
        BusTrips trip2 = new BusTrips("Bus Eireann", 5454, "Athlone", "Mullingar", "16/5/24", "7:00", "16/5/24", "9:30", 50, 7.25f);
        trips.add(trip1);
        trips.add(trip2);
    }
}
