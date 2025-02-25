
/**
 * A class that tests the TraficLights class
 *
 * @author Oskar Sokol
 * @version v1.0
 */
public class TestTrafficLight
{
    //Creates the main method to test other classes
    public static void main(String args[]) {
        //Create a new object of the TrafficLights class to test
        TrafficLights lights = new TrafficLights();
    //Loops 5 times while printing the state and colour of each light for each iteration
    for(int i = 0; i<5; i++) {
        //Prints a header which includes the iteration number
        System.out.println("--Run " + (i+1) + "--");
        //Calls the go method which updates the lights object and prints it to the terminal
        lights.go();
        lights.printState();
        //Calls the prepareToSop method which updates the lights object and prints it to the terminal
        lights.prepareToStop();
        lights.printState();
        //Calls the stop method which updates the lights object and prints it to the terminal
        lights.stop();
        lights.printState();
        //Prints a footer to the terminal and skips to the next line
        System.out.println("---------\n");
    }
}
}
