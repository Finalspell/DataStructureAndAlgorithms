package part5_double_finger_needle.question01;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-09-07-20:41
 */
public class LeetCode27 {
    public  int removeElement(int[] nums, int val){

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
