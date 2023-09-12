package part1_array.question03;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-08-21-21:19
 */
public class LeetCode977 {
    @Test
    public void test(){
        int[] nums = {-4,-1,0,3,10};
        int[] sortedSquares = sortedSquares(nums);
        for (int sortedSquare : sortedSquares) {
            System.out.println(sortedSquare);
        }
    }
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        Arrays.sort(nums);
        return nums;
    }
}
