
/**
 * @author Oskar Sokol
 * @version v1.0
 */
public class Booking
{
    private int noOfPassengers;
    private int id;
    //Constructor takes parameter for every field
    public Booking(int id, int noOfPassengers) {
        this.id = id;
        this.noOfPassengers = noOfPassengers;
    }
    //Getters and Setters for each field
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public int getNoOfPassengers(){
        return noOfPassengers;
    }
    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }
}
