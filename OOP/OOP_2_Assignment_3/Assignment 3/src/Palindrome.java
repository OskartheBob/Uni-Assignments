public class Palindrome {
    int operationCount = 0;//declare a variable to count operations
    int reverseTime = 0;//declare a Time variable for each method
    int elementTime = 0;
    int stackTime = 0;
    int recursionTime = 0;
    int reverseCount = 0;//declare a counting variable for each method
    int elementCount = 0;
    int stackCount = 0;
    int recursionCount = 0;

    public String decimalBinary(int decimal){
        String B_Number = Integer.toBinaryString(decimal); //inbuilt method that converts a decimal string to a binary string
        operationCount ++; //operation increment
        return B_Number;
    }

    public boolean reverseComparison(String input){
        long time = System.currentTimeMillis(); //note the time at the beginning of the method
        operationCount += 2;
        String reverse = new StringBuilder(input).reverse().toString(); //make the input as a StringBuilder, reverse it using in built method, cast it back to a String
        operationCount += 3;
        reverseTime += System.currentTimeMillis() - time; //note the final time and minus the beginning time to acquire final time
        operationCount += 2;
        return reverse.equals(input); //check if the reversed and original String are the same
    }

    public boolean elementComparison(String input){
        long time = System.currentTimeMillis();
        operationCount += 2;
        boolean check = true; //define a variable to check if its true or false
        operationCount ++;
        operationCount++;
        for(int i = 0; i < input.length(); i++){ //loop through the elements
            operationCount += 2;
            char first = input.charAt(i); //get the first character of the String
            operationCount += 2;
            char last = input.charAt(input.length() - (1+i)); //get the last character
            operationCount += 4;
            operationCount ++;
            if(first != last){ //check if the first and last character are equal
                check = false; //declare check as false and break if they are not the same
                operationCount ++;
                break;
            }
        }
        elementTime += System.currentTimeMillis() - time;
        operationCount += 2;
        return check;
    }

    public boolean stackComparison(String input){
        long time = System.currentTimeMillis();
        operationCount += 2;
        boolean check = true;
        operationCount ++;
        ArrayStack stack = new ArrayStack(); //create a new ArrayStack object
        operationCount ++;
        ArrayQueue queue = new ArrayQueue(); //create a new ArrayQueue object
        operationCount ++;
        operationCount ++;
        for(int i = 0; i < input.length(); i++){ //loop iterates through the elements in the String
            operationCount += 2;
            char character = input.charAt(i); //get the character in the String
            operationCount += 2;
            stack.push(character); //push the char onto the Stack
            operationCount += 3;
            queue.enqueue(character); //put the char in the queue
            operationCount += 3;
        }
        operationCount ++;
        for(int i = 0; i < input.length(); i++){ //loop iterates through the String
            operationCount += 2;
            operationCount += 7;
            if(stack.pop() != queue.dequeue()){ //check if the Stack pop and Queue dequeue are the same
                check = false;
                operationCount ++;
                break;
            }
        }
        stackTime += System.currentTimeMillis() - time;
        operationCount += 2;
        return check;
    }

    public String reverse(String input){
        operationCount += 3;
        if(input == null || input.length() <= 1){ //check to make sure the String has a length of more than 1
            return input;
        }
        operationCount ++;
        return reverse(input.substring(1)) + input.charAt(0); //return the last letter then add the second last and repeat
    }

    public boolean recursionComparison(String input){
        long time = System.currentTimeMillis();
        operationCount += 2;
        String recursion = reverse(input); //call the recursion method
        operationCount ++;
        recursionTime += System.currentTimeMillis() - time;
        operationCount += 2;
        return recursion.equals(input); //check if the reversed and original String are the same
    }
}
