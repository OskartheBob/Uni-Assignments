public class Palindrome {
    int operationCount = 0;
    int reverseTime = 0;
    int elementTime = 0;
    int stackTime = 0;
    int recursionTime = 0;
    int reverseCount = 0;
    int elementCount = 0;
    int stackCount = 0;
    int recursionCount = 0;

    public Palindrome(){

    }

    public String decimalBinary(int decimal){
        String B_Number = Integer.toBinaryString(decimal);
        operationCount ++;
        return B_Number;
    }

    public boolean reverseComparison(String input){
        long time = System.currentTimeMillis();
        operationCount += 2;
        String reverse = new StringBuilder(input).reverse().toString();
        operationCount += 3;
        reverseTime += System.currentTimeMillis() - time;
        operationCount += 2;
        return reverse.equals(input);
    }

    public boolean elementComparison(String input){
        long time = System.currentTimeMillis();
        operationCount += 2;
        boolean check = true;
        operationCount ++;
        operationCount++;
        for(int i = 0; i < input.length(); i++){
            operationCount += 2;
            char first = input.charAt(i);
            operationCount += 2;
            char last = input.charAt(input.length() - (1+i));
            operationCount += 4;
            operationCount ++;
            if(first != last){
                check = false;
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
        ArrayStack stack = new ArrayStack();
        operationCount ++;
        ArrayQueue queue = new ArrayQueue();
        operationCount ++;
        operationCount ++;
        for(int i = 0; i < input.length(); i++){
            operationCount += 2;
            char character = input.charAt(i);
            operationCount += 2;
            stack.push(character);
            operationCount += 3;
            queue.enqueue(character);
            operationCount += 3;
        }
        operationCount ++;
        for(int i = 0; i < input.length(); i++){
            operationCount += 2;
            operationCount += 7;
            if(stack.pop() != queue.dequeue()){
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
        if(input == null || input.length() <= 1){
            return input;
        }
        operationCount ++;
        return reverse(input.substring(1)) + input.charAt(0);
    }

    public boolean recursionComparison(String input){
        long time = System.currentTimeMillis();
        operationCount += 2;
        String recursion = reverse(input);
        operationCount ++;
        recursionTime += System.currentTimeMillis() - time;
        operationCount += 2;
        return recursion.equals(input);
    }
}
