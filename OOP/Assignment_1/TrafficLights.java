
/**
 * A class that represents a traffic light
 *
 * Oskar Sokol
 * v1.0
 */
public class TrafficLights
{
    private Light light_red;
    private Light light_amber;
    private Light light_green;
    //Constructor for objects of class Light
    public TrafficLights() {
        this.light_red = new Light("Red");
        this.light_amber = new Light("Amber");
        this.light_green = new Light("Green");
    }
    //Turns on the green light only
    public void go() {
        light_red.lightOff();
        light_amber.lightOff();
        light_green.lightOn();
    }
    //Turns on the amber light only
    public void prepareToStop() {
        light_red.lightOff();
        light_amber.lightOn();
        light_green.lightOff();
    }
    //Turns on the red light only
    public void stop() {
        light_red.lightOn();
        light_amber.lightOff();
        light_green.lightOff();
    }
    //Calls the printState of the light objects
    //This prints the state of the lights to the terminal
    public void printState() {
        light_red.printState();
        light_amber.printState();
        light_green.printState();
    }
}
