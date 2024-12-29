import java.util.Arrays;

public class SwapAdjacentElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("Original Array: " + Arrays.toString(array));
        
        swapAdjacentElements(array);
        
        System.out.println("Array after swapping adjacent elements: " + Arrays.toString(array));
    }

    public static void swapAdjacentElements(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}
