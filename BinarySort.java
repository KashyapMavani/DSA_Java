//Binary sort algorithm

import java.util.Arrays;

class BinarySort{

    static int quicksort(int arr[], int target) {

       
    // check if array is not empty

        if (arr.length == 0){
            System.out.println("Array with size Zero");
        }

        int start = 0;
        int end = arr.length-1;

    // condition to check if array is sorted in ascending or descending order

        Boolean isAsc = arr[start] < arr[end]; 
        

        while(start <= end){ 

            int middle = start + (end - start)/2;

            if (arr[middle] == target){
                System.out.println("Element found at Index : ");
                return middle;
            }

            if (isAsc) {

                if (arr[middle] > target){
                    end = middle-1;
                }
                else if (arr[middle] < target) {
                    start = middle+1;
                }

            }
            else {

                if (arr[middle] < target){
                    end = middle-1;
                }
                else if (arr[middle] > target) {
                    start = middle+1;
                }
            }
    }
    System.out.println("Element not present ");
    return -1;

    }

    
    public static void main(String[] args) {
        
        int[] array = {90,86,52,29,26,22,21,19,14,2,1}; 
        int target = 2;

        int ans = quicksort(array, target);  
        System.out.println(ans);
    }


}
