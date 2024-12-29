public class GCD {

// ---------------------------------Brute Force-------------------------------------------------------
    public static void main(String[] args) {
        int N1 = 17;
        int N2 = 51;
        int iterator;
        int GCD = 0;

        if(N1>N2){
            iterator = N2;
        }else{
            iterator = N1;
        }

        for(int i = 2; i <= iterator; i++){
            if(N1%i == 0 && N2%i ==0){
                GCD = i;
            }
        }

        System.out.println(GCD);
    }

                                    
// --------------------------------------------------- Optimal approach----------------------------------------------------
    // Continue loop as long as both
    // a and b are greater than 0
    public static int findGcd(int a, int b) {
        while(a > 0 && b > 0) {
            // If a is greater than b,
            // subtract b from a and update a
            if(a > b) {
                // Update a to the remainder
                // of a divided by b
                a = a % b;
            }
            // If b is greater than or equal
            // to a, subtract a from b and update b
            else {
                // Update b to the remainder
                // of b divided by a
                b = b % a;
            }
        }
        // Check if a becomes 0,
        // if so, return b as the GCD
        if(a == 0) {
            return b;
        }
        // If a is not 0,
        // return a as the GCD
        return a;
    }
    
                                
                            
}
