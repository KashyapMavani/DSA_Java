public class FibonacciNumber {
    public static void main(String args[]){

       System.out.println(fibonacciNum(4));
    }

    static int fibonacciNum(int n){

        if(n < 2){
            return n;
        }

        return fibonacciNum(n-1) + fibonacciNum(n-2);

    }
}