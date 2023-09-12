package part3_hashtable.question07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-09-01-20:12
 */
public class LeetCode15 {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) return result;

            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if(sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    //去重
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    right--;
                    left++;
                }
            }


        }
        return result;
    }
}


