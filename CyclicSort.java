import java.util.Arrays;

public class CyclicSort {

     public static void main(String[] args) {


        int[] array = {4,6,3,1,5,2};
        cyclicSort(array);
        System.out.println(Arrays.toString(array));

     }

    static void cyclicSort(int[] arr){

        int value;
        int index = 0;
        
        while (index < arr.length-1) {
            
            if(arr[index] != index+1){
                value = arr[index];
                arr[index] = arr[value-1];
                arr[value-1] = value;
            }
            else{
                index++;
            }
        }
        
    }
}