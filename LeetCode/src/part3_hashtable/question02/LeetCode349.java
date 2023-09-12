package part3_hashtable.question02;

import org.junit.Test;

import java.util.*;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-08-30-19:51
 */
public class LeetCode349 {
    @Test
    public void test() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] intersection = intersection(nums1, nums2);
        for (int i : intersection) {
            System.out.println(i);
        }
    }

    public int[] intersection1(int[] nums1, int[] nums2) {


        Set<Integer> resultSet = new HashSet<>();

        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }

        for (int i : nums2) {
            if (set.contains(i)) {
                resultSet.add(i);
            }
        }

        int[] result = new int[resultSet.size()];
        int count = 0;
        for (Integer i : resultSet) {
            result[count++] = i;
        }

        return result;
    }

    public int[] intersection(int[] nums1, int[] nums2) {

        int[] hashArray = new int[1005];

        for (int num : nums1) {
            hashArray[num] = 1;
        }

        Set<Integer> resultSet = new HashSet<>();

        for (int num : nums2) {
            if(hashArray[num] == 1) {//如果哈希数组中存在
                resultSet.add(num);//放入结果集合中
            }
        }


        int[] result = new int[resultSet.size()];
        int count = 0;
        for (Integer i : resultSet) {
            result[count++] = i;
        }

        return result;
    }

}

