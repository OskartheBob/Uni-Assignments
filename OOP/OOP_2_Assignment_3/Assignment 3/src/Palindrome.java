public class Palindrome {
    int reverseOpCnt = 0;
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
        return B_Number;
    }

    public boolean reverseComparison(String input){
        long time = System.currentTimeMillis();
        String reverse = new StringBuilder(input).reverse().toString();
        reverseTime += System.currentTimeMillis() - time;
        return reverse.equals(input);
    }

    public boolean elementComparison(String input){
        long time = System.currentTimeMillis();
        boolean check = true;
        for(int i = 0; i < input.length(); i++){
            char first = input.charAt(i);
            char last = input.charAt(input.length() - (1+i));
            if(first != last){
                check = false;
                break;
            }
        }
        elementTime += System.currentTimeMillis() - time;
        return check;
    }

    public boolean stackComparison(String input){
        long time = System.currentTimeMillis();
        boolean check = true;
        ArrayStack stack = new ArrayStack();
        ArrayQueue queue = new ArrayQueue();
        for(int i = 0; i < input.length(); i++){
            char character = input.charAt(i);
            stack.push(character);
            queue.enqueue(character);
        }
        for(int i = 0; i < input.length(); i++){
            if(stack.pop() != queue.dequeue()){
                check = false;
                break;
            }
        }
        stackTime += System.currentTimeMillis() - time;
        return check;
    }

    public String reverse(String input){
        if(input == null || input.length() <= 1){
            return input;
        }
        return reverse(input.substring(1)) + input.charAt(0);
    }

    public boolean recursionComparison(String input){
        long time = System.currentTimeMillis();
        String recursion = reverse(input);
        recursionTime += System.currentTimeMillis() - time;
        return recursion.equals(input);
    }
}
