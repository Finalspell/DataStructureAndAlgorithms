package part4_string.question05;

import org.junit.Test;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-09-04-20:21
 */
public class SwordOffer58 {
    @Test
    public void test() {
        String s = "abcdefg";
        System.out.println(reverseLeftWords(s, 2));
    }
    public String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        reverseString(chars, 0, n - 1);
        reverseString(chars, n, chars.length - 1);
        reverseString(chars, 0, chars.length - 1);
        return new String(chars);
    }

    public void reverseString(char[] s, int start, int end) {
        while (start < end) {
            s[start] ^= s[end];
            s[end] ^= s[start];
            s[start] ^= s[end];
            start++;
            end--;
        }
    }


}
