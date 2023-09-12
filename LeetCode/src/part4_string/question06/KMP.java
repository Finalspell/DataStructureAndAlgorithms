package part4_string.question06;

import org.junit.Test;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-09-06-22:28
 */
public class KMP {
    @Test
    public void testKmp() {
        String haystack = "leetcode", needle = "de";
        int i = kmp(haystack, needle);
        System.out.println(i);
    }

    @Test
    public void testGetNext() {

        String needle = "aabaaf";
        int[] next = new int[needle.length()];
        getNext(next, needle);
        for (int i : next) {
            System.out.println(i);
        }
    }

    public int kmp(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }

        int[] next = new int[needle.length()];

        getNext(next, needle);

        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {

            while (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                j = next[j - 1];
            }

            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            }
            if (j == needle.length()) {
                return i - j + 1;
            }
        }

        return -1;

    }

    private void getNext(int[] next, String needle) {

        int j = 0;
        next[0] = 0;

        for (int i = 1; i < needle.length(); i++) {
            while (j > 0 && needle.charAt(i) != needle.charAt(j)) {
                j = next[j - 1];
            }

            if (needle.charAt(i) == needle.charAt(j)) {
                next[i] = ++j;
            }
        }

    }
}
