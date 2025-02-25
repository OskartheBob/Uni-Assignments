
/**
 * A class that represents the state of a singular light
 *
 * @author Oskar Sokol
 * @version v1.0
 */
public class Light
{
    private String colour;
    private boolean is_on;
    //Constructor sets the initial value of attributes
    public Light(String colour) {
        is_on = false;
        this.colour = colour;
    }
    //Accessor and Mutator Methods to access and change the colour attribute
    public String getColour() {
        return colour;
    }
    public void setcolour(String colour) {
        this.colour = colour;
    }
    //Methods used to turn the light on and off
    public void lightOn() {
        is_on = true;
    }
    public void lightOff() {
        is_on = false;
    }
    //Method that prints the current state of the light
    public void printState() {
        if(is_on == true) {
            System.out.println(colour);
        }
        else {
            System.out.println("=OFF=");
        }
    }
}
