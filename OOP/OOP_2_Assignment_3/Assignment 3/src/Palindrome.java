public class Palindrome {

    public Palindrome(){

    }

    public long decimalBinary(int decimal){
        
        long B_Number = 0;
        long cnt = 0;
        while (decimal != 0) {
            int rem = decimal % 2;
            double c = Math.pow(10, cnt);
            B_Number += rem * c;
            decimal /= 2;

            // Count used to store exponent value
            cnt++;
        }
        System.out.println(B_Number);
        return B_Number;
    }

    /*public boolean reverseComparison(String input){

    }

    public boolean elementComparison(String input){

    }

    public boolean stackComparison(String input){

    }

    public boolean recursionComparison(String input){

    }*/
}
