package part1_array.question04;

import org.junit.Test;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-08-22-20:13
 */
public class LeetCode209Better {

    @Test
    public void test() {
        int[] arr = {5, 1, 3, 5, 10, 7, 4, 9, 2, 8};
        int i = minSubArrayLen(15, arr);
        System.out.println(i);
    }

    public int minSubArrayLen(int target, int[] nums) {

        int sum = 0;
        int j = 0;
        int result = 0;


        for (int i = 0; i < nums.length; i++) {//窗口扩大
            sum = sum + nums[i];//记录子序列的和

            while(sum >= target){//满足窗口,只要满足窗口就缩小窗口
                if(result > i - j + 1 || result == 0){//记录最短的子序列的长度
                    result = i - j + 1;
                }
                sum = sum - nums[j];
                j++;//窗口收紧
            }
        }

        return result;
    }
}
