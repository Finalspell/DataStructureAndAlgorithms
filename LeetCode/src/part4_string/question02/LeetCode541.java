package part4_string.question02;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-09-02-19:38
 */
public class LeetCode541 {
    public String reverseStr(String s, int k) {

        char[] chars = s.toCharArray();

        int size = chars.length;

        for (int i = 0; i < size; i += 2 * k) {

            if (i + k <= size) {
                reverse(chars, i, i + k);
                continue;
            }

            reverse(chars, i, size);
        }
        return String.valueOf(chars);
    }

    public char[]  reverse(char[] s, int left, int right) {
        right--;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return s;
    }
}
