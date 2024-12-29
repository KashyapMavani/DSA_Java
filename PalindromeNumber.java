public class PalindromeNumber {

    public static void main(String[] args) {

        int Originalnum = 1221;
        int num = Originalnum;
        int revNum = 0;
        // Reversing the original number then reversed number will be used to compare it with original number 
        while(num > 0){
            int lastDigit = num%10;
            revNum = (revNum * 10) + lastDigit;
            num = num/10;
        }

        // Checking if the reversed number obtained is equal to the original number or not if they are equal then it is Palindrome
        if(Originalnum == revNum){
            System.out.println("Is Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    
    }
    

}
