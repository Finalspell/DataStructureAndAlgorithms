package part4_string.question06;

import org.junit.Test;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-09-06-21:03
 */
public class LeetCode28 {

    @Test
    public void test() {
        int[] next = new int[6];
        String s = "aabaaf";
        getNext(next, s);
        for (int i : next) {
            System.out.println(i);
        }
    }

    @Test
    public void testKmp() {
        String haystack = "leetcode", needle = "leeto";
        int i = strStr(haystack, needle);
        System.out.println(i);
    }
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;

        int[] next = new int[needle.length()];

        getNext(next, needle);

        int j = 0;

        for (int i = 0; i < haystack.length(); i++) {


            while (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                j = next[j - 1];
            }

            if(haystack.charAt(i) == needle.charAt(j)) {
                j++;
            }

            if(j == needle.length()) {
                return i - j + 1;
            }
        }

        return -1;
    }

    private void getNext(int[] next, String needle) {
        int j = 0;
        next[0] = 0;
        for (int i = 1; i < next.length; i++) {
            while (j > 0 && needle.charAt(j) != needle.charAt(i)) {
                j = next[j - 1];
            }
            if(needle.charAt(j) == needle.charAt(i)) {
                next[i] = ++j;
            }
        }
    }
}


