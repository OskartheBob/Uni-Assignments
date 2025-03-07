public class Main {

    public static void main(String[] args){
        Palindrome palindrome = new Palindrome();

        palindrome.operationCount = 0;
        for(int i = 0; i < 1000000; i++){
            boolean decimal = palindrome.reverseComparison(String.valueOf(i));
            boolean binary = palindrome.reverseComparison(palindrome.decimalBinary(i));
            if(decimal && binary){
                palindrome.reverseCount ++;
            }
            if(i%50000 == 0 && i != 0){
                System.out.println("Range to " + i);
                System.out.print("Time Taken: " + palindrome.reverseTime + "ms | ");
                System.out.print("Number of Dual Base Palindromes:  " + palindrome.reverseCount + "| ");
                System.out.println("Number of Operations: " + palindrome.operationCount + "| ");
            }
        }
        System.out.println("Range to 1000000");
        System.out.print("Time Taken: " + palindrome.reverseTime + "ms | ");
        System.out.print("Number of Dual Base Palindromes:  " + palindrome.reverseCount + "| ");
        System.out.println("Number of Operations: " + palindrome.operationCount + "| ");
        System.out.println("------------------------------------------------------------------------------------------");

        palindrome.operationCount = 0;
        for(int i = 0; i < 1000000; i++){
            boolean decimal = palindrome.elementComparison(String.valueOf(i));
            boolean binary = palindrome.elementComparison(palindrome.decimalBinary(i));
            if(decimal && binary){
                palindrome.elementCount ++;
            }
            if(i%50000 == 0 && i != 0){
                System.out.println("Range to " + i);
                System.out.print("Time Taken: " + palindrome.elementTime + "ms | ");
                System.out.print("Number of Dual Base Palindromes:  " + palindrome.elementCount + "| ");
                System.out.println("Number of Operations: " + palindrome.operationCount + "| ");
            }
        }
        System.out.println("Range to 1000000");
        System.out.print("Time Taken: " + palindrome.elementTime + "ms | ");
        System.out.print("Number of Dual Base Palindromes:  " + palindrome.elementCount + "| ");
        System.out.println("Number of Operations: " + palindrome.operationCount + "| ");
        System.out.println("------------------------------------------------------------------------------------------");

        palindrome.operationCount = 0;
        for(int i = 0; i < 1000000; i++){
            boolean decimal = palindrome.stackComparison(String.valueOf(i));
            boolean binary = palindrome.stackComparison(palindrome.decimalBinary(i));
            if(decimal && binary){
                palindrome.stackCount ++;
            }
            if(i%50000 == 0 && i != 0){
                System.out.println("Range to " + i);
                System.out.print("Time Taken: " + palindrome.stackTime + "ms | ");
                System.out.print("Number of Dual Base Palindromes:  " + palindrome.stackCount + "| ");
                System.out.println("Number of Operations: " + palindrome.operationCount + "| ");
            }
        }
        System.out.println("Range to 1000000");
        System.out.print("Time Taken: " + palindrome.stackTime + "ms | ");
        System.out.print("Number of Dual Base Palindromes:  " + palindrome.stackCount + "| ");
        System.out.println("Number of Operations: " + palindrome.operationCount + "| ");
        System.out.println("------------------------------------------------------------------------------------------");

        palindrome.operationCount = 0;
        for(int i = 0; i < 1000000; i++){
            boolean decimal = palindrome.recursionComparison(String.valueOf(i));
            boolean binary = palindrome.recursionComparison(palindrome.decimalBinary(i));
            if(decimal && binary){
                palindrome.recursionCount ++;
            }
            if(i%50000 == 0 && i != 0){
                System.out.println("Range to " + i);
                System.out.print("Time Taken: " + palindrome.recursionTime + "ms | ");
                System.out.print("Number of Dual Base Palindromes:  " + palindrome.recursionCount + "| ");
                System.out.println("Number of Operations: " + palindrome.operationCount + "| ");
            }
        }
        System.out.println("Range to 1000000");
        System.out.print("Time Taken: " + palindrome.recursionTime + "ms | ");
        System.out.print("Number of Dual Base Palindromes:  " + palindrome.recursionCount + "| ");
        System.out.println("Number of Operations: " + palindrome.operationCount + "| ");
        System.out.println("------------------------------------------------------------------------------------------");
    }
}
