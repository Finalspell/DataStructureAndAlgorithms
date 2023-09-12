package part1_array.question02;

import org.junit.Test;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-08-21-20:01
 */
public class LeetCode27 {

    @Test
    public  void test(){
        int[] arr = {3, 2, 2, 3};
        int i = removeElement(arr, 3);
        for (int j = 0; j < i; j++) {
            System.out.println(arr[j]);
        }

    }

    public int removeElement(int[] nums, int val) {

        int size = nums.length;

        for (int i = 0; i < size; i++) {
            if(nums[i] == val){
                for (int j = i + 1; j < nums.length; j++) {
                    nums[j - 1] = nums[j];
                }
                i--;//下标i以后的坐标都向前移动了一位，所以i也要向前移动一位
                size--;
            }
        }

        return size;
    }
}
