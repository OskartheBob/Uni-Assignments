
/**
 * @author Oskar Sokol
 * @version v1.0
 */
public class CityLink extends BusVendors
{   //Constructor stores different available trips
    public CityLink() {
        BusTrips trip1 = new BusTrips("City Link", 2376, "Castlegar", "Dingle", "7/3/24", "16:00", "7/3/24", "21:30", 50, 14f);
        BusTrips trip2 = new BusTrips("City Link", 7452, "Tuam", "Headford", "27/3/24", "12:00", "27/3/24", "13:30", 35, 3.60f);
        trips.add(trip1);
        trips.add(trip2);
    }
}
