public class ExceptionHandling {  
  
    public static void main(String[] args) {  
          
        try {    
            int a[] = new int[5];    
            a[5] = 1;  // outOf bound
            a[4] = 1 / 0;  // arthematic
        }
        catch ( ArithmeticException e) {  
            System.out.println("Exception occurs: " + e.getMessage());  
        }
                      
    }  
}  