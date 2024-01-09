import java.util.Arrays;

public class MissingNumber268 {

     public static void main(String[] args) {


        int[] array = {9,6,4,2,3,5,7,0,1};
        
        System.out.println(missingNumber(array));
        System.out.println(Arrays.toString(array));
     }

    static int missingNumber(int[] arr){

        int index = 0;
        
        while (index < arr.length) {
            
            if(arr[index] < arr.length && arr[index] != arr[arr[index]]){
                int temp = arr[arr[index]];
                arr[arr[index]] = arr[index];
                arr[index]= temp;
            }
            else{
                index++;
            }
        }

        for(int i =0 ; i < arr.length; i++){
            if(arr[i] != i){
                return i;
            }
        }

        return arr.length;
        
    }
}