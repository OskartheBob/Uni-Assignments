
/**
 * @author Oskar Sokol
 * @version v1.0
 */
public class BusTrips
{   
    private String busCompany;
    private int id;
    private String startingLocation;
    private String destination;
    private String dateOfDeparture;
    private String timeOfDeparture;
    private String dateOfArrival;
    private String timeOfArrival;
    private int noOfSeats;
    private float fare;
    //BusTrips Constructor takes in a parameter for each field
    public BusTrips(String busCompany, int id, String startingLocation, String destination, String dateOfDeparture, String timeOfDeparture, String dateOfArrival, String timeOfArrival, int noOfSeats, float fare) {
        this.busCompany = busCompany;
        this.id = id;
        this.startingLocation = startingLocation;
        this.destination = destination;
        this.dateOfDeparture = dateOfDeparture;
        this.timeOfDeparture = timeOfDeparture;
        this.dateOfArrival = dateOfArrival;
        this.timeOfArrival = timeOfArrival;
        this.noOfSeats = noOfSeats;
        this.fare = fare;
    }
    //toString method overridden
    @Override
    public String toString() {
        String strng = "------------------\n";
        strng += "Bus Company: " + busCompany + "\n"; 
        strng += "ID: " + id + "\n";        
        strng += "Origin: " + startingLocation + "\n";
        strng += "Destination: " + destination + "\n";
        strng += "Departure Date: " + dateOfDeparture + "\n";
        strng += "Departure Time: " + timeOfDeparture + "\n";
        strng += "Arrival Date: " + dateOfArrival + "\n";
        strng += "Arrival Time: " + timeOfArrival + "\n";
        strng += "Seats Available: " + noOfSeats + "\n";
        strng += "Ticket Price: " + fare + "\n";
        strng += "------------------\n\n";
        return strng;
    }
    //Getters and Setters for each field
    public String getBusCompany(){
        return busCompany;
    }
    public void setBusCompany(String busCompany){
        this.busCompany = busCompany;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getStartingLocation(){
        return startingLocation;
    }
    public void setStartingLocation(String startingLocation){
        this.startingLocation = startingLocation;
    }
    
    public String getDestination(){
        return destination;
    }
    public void setDestination(String destination){
        this.destination = destination;
    }
    
    public String getDateOfDeparture(){
        return dateOfDeparture;
    }
    public void setDateOfDeparture(String dateOfDeparture){
        this.dateOfDeparture = dateOfDeparture;
    }
    
    public String getTimeOfDeparture(){
        return timeOfDeparture;
    }
    public void setTimeOfDeparture(String timeOfDeparture){
        this.timeOfDeparture = timeOfDeparture;
    }
    
    public String getDateOfArrival(){
        return dateOfArrival;
    }
    public void setDateOfArrival(String dateOfArrival){
        this.dateOfArrival = dateOfArrival;
    }
    
    public String getTimeOfArrival(){
        return timeOfArrival;
    }
    public void setTimeOfArrival(String timeOfArrival){
        this.timeOfArrival = timeOfArrival;
    }
    
    public int getNoOfSeats(){
        return noOfSeats;
    }
    public void setNoOfSeats(int noOfSeats){
        this.noOfSeats = noOfSeats;
    }
    
    public float getFare(){
        return fare;
    }
    public void setFare(float fare){
        this.fare = fare;
    }
}
