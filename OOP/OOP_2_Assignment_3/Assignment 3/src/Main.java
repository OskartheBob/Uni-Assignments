public class Main {

    public static void main(String[] args){
        Palindrome palindrome = new Palindrome();

        for(int i = 0; i < 1000000; i++){
            boolean decimal = palindrome.reverseComparison(String.valueOf(i));
            boolean binary = palindrome.reverseComparison(palindrome.decimalBinary(i));
            if(decimal && binary){
                palindrome.reverseCount ++;
            }
        }
        System.out.println(palindrome.reverseTime);
        System.out.println(palindrome.reverseCount);

        for(int i = 0; i < 1000000; i++){
            boolean decimal = palindrome.elementComparison(String.valueOf(i));
            boolean binary = palindrome.elementComparison(palindrome.decimalBinary(i));
            if(decimal && binary){
                palindrome.elementCount ++;
            }
        }
        System.out.println(palindrome.elementTime);
        System.out.println(palindrome.elementCount);

        for(int i = 0; i < 1000000; i++){
            boolean decimal = palindrome.stackComparison(String.valueOf(i));
            boolean binary = palindrome.stackComparison(palindrome.decimalBinary(i));
            if(decimal && binary){
                palindrome.stackCount ++;
            }
        }
        System.out.println(palindrome.stackTime);
        System.out.println(palindrome.stackCount);

        for(int i = 0; i < 1000000; i++){
            boolean decimal = palindrome.recursionComparison(String.valueOf(i));
            boolean binary = palindrome.recursionComparison(palindrome.decimalBinary(i));
            if(decimal && binary){
                palindrome.recursionCount ++;
            }
        }
        System.out.println(palindrome.recursionTime);
        System.out.println(palindrome.recursionCount);
    }
}
