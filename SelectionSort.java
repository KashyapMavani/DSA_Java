import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]){

        int[] array = {6,5,8,2,7,10,-1,-8,100,-100};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void selectionSort(int[] arr){

        int max; 
        int maxindex;

        for(int i =0 ; i < arr.length - 1; i++){

            max = arr[0];
            maxindex = 0;

            for(int j =0 ; j < arr.length - i; j++ ){


                if(arr[j] > max){
                    max = arr[j];
                    maxindex = j;
                }
            }

            int temp = arr[arr.length - i-1];
            arr[arr.length - i-1] = arr[maxindex];
            arr[maxindex] = temp;
        }

    }
}
