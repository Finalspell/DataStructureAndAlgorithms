package part5_double_finger_needle.question02;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-09-07-20:46
 */
public class LeetCode344 {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            s[left] ^= s[right];
            s[right] ^= s[left];
            s[left] ^= s[right];
            left++;
            right--;
        }
    }
}
