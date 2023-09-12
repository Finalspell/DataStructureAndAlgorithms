package part4_string.question01;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-09-02-19:20
 */
public class LeetCode344 {
    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {
//            char temp = s[left];
//            s[left] = s[right];
//            s[right] = temp;
            s[left] ^= s[right];
            s[right] ^= s[left];
            s[left] ^= s[right];
            left++;
            right--;
        }

    }
}


