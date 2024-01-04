import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]){

        int[] array = {9,8,7,5,4,2,1};

        bubbleSort(array);

        System.out.println(Arrays.toString(array));
        
    }

    static void bubbleSort(int[] arr){

        
        for(int i = 0; i < arr.length-1; i++){

            Boolean swapped = false;

            for(int j = 1; j < arr.length-i;j++ ){

                if(arr[j] < arr[j-1]){

                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }

    }
}
