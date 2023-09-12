package part3_hashtable.question05;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-08-31-19:31
 */
public class LeetCode454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        Map<Integer, Integer> map = new HashMap<>();

        int res = 0;

        for (int i : nums1) {
            for (int j : nums2) {
//                if(map.containsKey(i + j)) {
//                    map.put(i + j, map.get(i + j) + 1);
//                } else {
//                    map.put(i + j, 1);
//                }
                int sum = i + j;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        for (int i : nums3) {
            for (int j : nums4) {
                int num = 0 - (i + j);
//                if (map.containsKey(num)) {
//                    res += map.get(num);
//                }
                res += map.getOrDefault(num, 0);
            }
        }

        return res;
    }
}
