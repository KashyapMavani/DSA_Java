public class SecondLargestNum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 95, 22, 101, 9};
        System.out.println(secondLargestNum(nums));
    }

    static int secondLargestNum(int nums[]){
        int SecondMax = Integer.MIN_VALUE;
        int Max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > Max) {                    
                SecondMax = Max;
                Max = nums[i];
            }
            else if(nums[i] > SecondMax){
                SecondMax = nums[i];
            }
        }

        return SecondMax;
    }
}
