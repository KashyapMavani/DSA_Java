public class FindFactorial {

    public static void main(String[] args) {
        
        int ans = findFactorial(0);
        System.out.println(ans);
    }

    static int findFactorial(int n){

        if(n<=0){

            System.out.println("Enter number greater than zero.");
            return -1;
        }
        if(n==1){
            return 1;
        }

        return n * findFactorial(n-1);
    }
}