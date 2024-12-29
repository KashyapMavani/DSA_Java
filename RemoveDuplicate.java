import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        String ans = Arrays.toString(removeDuplicates(nums));
        System.out.println(ans);
        // System.out.println(removeDuplicates(nums));
    }
    static int[] removeDuplicates(int[] nums) {
        int k = 0;
        // for (int i = 0; i < nums.length-1; i++) {
        //     if (nums[i] != nums[i+1]){
        //         k++;
        //     }
        // }
        int temp = nums[0];                            // 0 0 1 1 1 2 2 3 3 4
        for(int i = 1; i < nums.length; i++){          // 
            if(nums[k] != nums[i]){
                k++;
                nums[k] = nums[i];
                
            }
        }
        // return k;
        return nums;
    }   
}


/*import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        // String ans = Arrays.toString(removeDuplicates(nums));
        // System.out.println(ans);
        System.out.println(removeDuplicates(nums));
    }
    static int removeDuplicates(int[] nums) {
        int k = 0;
        int temp = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == temp){
                nums[i] = Integer.MAX_VALUE;
            }else{
                k++;
                temp = nums[i];
            }
        }
        push(nums);
        int z = nums.length-1;
        int val = Integer.MAX_VALUE;
        while (nums[z] == val) {
            z--;
        }
        // return nums;
        return z+1;
    }

    static int[] push(int[] nums){
        int temp = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == temp) {
                Arrays.sort(nums);
            }
        }
        return nums;
    }
}
 */