package part1_array.question04;

import org.junit.Test;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-08-22-19:39
 */
public class LeetCode209 {

    @Test
    public void test() {
        int[] arr = {5, 1, 3, 5, 10, 7, 4, 9, 2, 8};
        int i = minSubArrayLen(15, arr);
        System.out.println(i);
    }

    public int minSubArrayLen(int target, int[] nums) {


        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum >= target) {
                    if (result == 0 || result > j - i + 1)
                        result = j - i + 1;
                    break;
                }
            }
        }
        return result;
    }
}
