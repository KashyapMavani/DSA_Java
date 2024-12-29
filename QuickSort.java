import java.util.Arrays;

class QuickSort {

    static void swap(int arr[], int lp, int rp) {
        int temp = arr[lp];
        arr[lp] = arr[rp];
        arr[rp] = temp;
    }

    static void quicksort(int arr[], int lp, int rp) {
        int p = lp + (rp - lp) / 2; // Set pivot to the middle element
        int pivot = arr[p];

        int s = lp;
        int e = rp;

        if (s >= e) {
            return;
        }

        while (e >= s) {

            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }

            if (e >= s) {
                swap(arr, s, e);
                s++;
                e--;
            }
        }

            quicksort(arr, lp, e);
            quicksort(arr, s, rp);
    }

    public static void main(String[] args) {
        int[] array = {20, 30, 5, 11, 88, 56, 63};
        int s = 0;
        int e = array.length - 1;
        quicksort(array, s, e);
        System.out.println(Arrays.toString(array));
    }
}