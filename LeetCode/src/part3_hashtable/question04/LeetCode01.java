package part3_hashtable.question04;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-08-31-18:47
 */
public class LeetCode01 {
    public int[] twoSum1(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }

}
