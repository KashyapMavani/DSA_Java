public class CountDigit {

    public static void main(String[] args) {
 //////////////////////////-Brute Force method-----------------------------------       
        int num = 657283;
        // int count = 0;
        // while(num != 0){
        //     num = num / 10;
        //     count++;
        // }
        // System.out.println(count);
// -----------------------------------------------------------------------

//-------------------Optimal Method--------------------------------

        int countOfNum = (int) (Math.log10(num) + 1);
        System.out.println(countOfNum);


    }

}
