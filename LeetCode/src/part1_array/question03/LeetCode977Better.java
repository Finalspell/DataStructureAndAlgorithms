package part1_array.question03;

import org.junit.Test;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-08-21-21:25
 */
public class LeetCode977Better {

    @Test
    public void test(){
        int[] nums = {-4,-1,0,3,10};
        int[] sortedSquares = sortedSquares(nums);
        for (int sortedSquare : sortedSquares) {
            System.out.println(sortedSquare);
        }
    }
    public int[] sortedSquares(int[] nums){

        int i = 0;
        int j = nums.length - 1;
        int index = j;

        int[] arr = new int[nums.length];

        while (index >= 0){
            int leftNum = nums[i] * nums[i];
            int rightNum = nums[j] * nums[j];

            if(leftNum < rightNum){
                arr[index] = rightNum;
                j--;
                index--;
            }else{
                arr[index] = leftNum;
                i++;
                index--;
            }
        }

        return arr;
    }
}
