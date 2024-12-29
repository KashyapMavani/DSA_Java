public class ReverseNum {
    public static void main(String[] args) {
        int num = 1234;
        int revNum = 0; // store the reverse of the input integer.

        while(num > 0){
            int lastDigit = num % 10; // Extract the last digit of 'n' and store it in 'ld'.
            revNum = (revNum * 10) + lastDigit;// Multiply the current reverse number by 10 and add the last digit.
            num = num / 10;  // Remove the last digit from 'n'.
        }
        System.out.println(revNum);
    }
}
