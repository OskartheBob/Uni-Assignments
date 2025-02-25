import java.util.Scanner; //Import the Scanner Class

public class Main {

    public static void main(String[] args){
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray(); //create a character array with the alphabet
        Scanner reader = new Scanner(System.in); //Create a scanner object

        System.out.println("---Type the alphabet in order---\n" + "[Press the enter key between letters]");
        String direction;
        while(true) { //loop that runs until the correct input is put in
            System.out.println("Are you gonna type Forwards or Backwards(f/b)?"); //Ask the player for direction
            direction = reader.nextLine(); //Read user input for direction
            if (!direction.equals("f") && !direction.equals("b")) { //if f or b are not entered spit out an error
                System.out.println("Invalid input! :(\n" + "You must enter 'f' or 'b' you start");
            }
            else{
                break;
            }
        }

        double startTime = System.currentTimeMillis(); //start counting the time
        switch(direction){ //use a switch to change between forwards and backwards
            case "f": //forwards case
                for(int i = 0; i < 26;){ //iterate through the alphabet
                    System.out.println("Type the letter [" + alphabet[i] + "] and press enter:");
                    char letter = reader.next().charAt(0); //take user input for the letter
                    if(letter == alphabet[i]){ //only move on to the next letter if the previous one has been entered
                        i++;
                    }
                }
                break;

            case "b": //backwards case
                for(int i = 25; i > -1;){ //iterate through the alphabet backwards
                    System.out.println("Type the letter [" + alphabet[i] + "] and press enter:");
                    char letter = reader.next().charAt(0); //take user input for the letter
                    if(letter == alphabet[i]){
                        i--; //only move on to the next letter if the previous one has been entered
                    }
                }
                break;
        }
        double endTime = System.currentTimeMillis(); //stop the timer
        double totalTime = (endTime - startTime)/1000; //change the time to seconds
        System.out.println("Congratulations you did it!\n" + "Time taken: " + totalTime);
    }
}


