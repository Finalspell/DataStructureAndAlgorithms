package part1_array.question01;

/**
 * @author lwx
 * @version 1.0
 * @create 2023-08-10-20:46
 * 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
 * <p>
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 */
public class LeetCode34 {
    public int[] searchRange(int[] nums, int target) {

        int firstLocation = searchFirstLocation(nums, target);
        int lastLocation = searchLastLocation(nums, target);

        if(firstLocation == -2 || lastLocation == -2){
            return new int[]{-1,-1};
        }
        if (lastLocation - firstLocation > 1){
            return new int[]{firstLocation + 1, lastLocation - 1};
        }

        return new int[]{-1,-1};

    }

    public int searchFirstLocation(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int leftBorder = -2;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (target <= nums[mid]) {
                //下次查找[left,mid - 1]
                right = mid - 1;
                leftBorder = right;
            } else {
                //num[mid] < target
                //下次查找[mid + 1, right]
                left = mid + 1;
            }
        }
        return leftBorder;
    }

    public int searchLastLocation(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int rightBorder = -2;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] <= target) {
                left = mid + 1;
                rightBorder = left;
            }else{
                right = mid - 1;
            }
        }

        return rightBorder;
    }

}
