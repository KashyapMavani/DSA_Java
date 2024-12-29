import java.util.Arrays;

public class FindMaxAlternateSum {

    public static void main(String[] args) {
        int[] rachaiin = {1, 2, -2, 5, 3, 4, 3, 4};

        int[] result = alternateSum(rachaiin);
        System.out.println(Arrays.toString(result));
    }

    static int[] alternateSum(int[] arr) {

        int max = 0; 
        int sum = 0;
        int first = 0;
        int second = 0;
        for(int i = 0; i < arr.length - 2; i++){
            sum = arr[i] + arr[i + 1];
            if (sum > max) {
                max = sum;
                first = i;
                second = i + 1;
            }
        }
        return new int[]{first,second};
    }
}