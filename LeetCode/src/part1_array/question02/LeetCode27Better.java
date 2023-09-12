package part1_array.question02;

import org.junit.Test;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-08-21-20:16
 */
public class LeetCode27Better {

    @Test
    public void test() {
        int[] arr = {3, 2, 2, 3};
        int i = removeElement(arr, 3);
        for (int j = 0; j < i; j++) {
            System.out.println(arr[j]);
        }

    }

    public int removeElement(int[] nums, int val) {

        int size = 0;

        int j = 0;//慢指针，标记新数组的下标，

        for (int i = 0; i < nums.length; i++) {//快指针，遍历整个数组
            if (nums[i] != val) {//查询到数组元素为新数组时，慢指针更新，数组更新
                nums[j] = nums[i];
                j++;
            }
        }
        return j;//最终返回的慢指针的下标即是新数组的长度
    }


}
