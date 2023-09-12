package part3_hashtable.question07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-09-01-20:56
 */
public class LeetCode18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 3; i++) {

            // nums[i] > target 直接返回, 剪枝操作
            if(nums[i] > 0 && nums[i] > target) {
                return result;//剪枝
            }

            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;// 对nums[i]去重
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if(nums[i] + nums[j] > target &&target > 0) {
                    break;//剪枝
                }

                if(j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;// 对nums[j]去重
                }

                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // 对nums[left]和nums[right]去重
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
        }
        return result;
    }
}
