package part4_string.question04;

import org.junit.Test;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-09-04-19:05
 */
public class LeetCode151 {

    @Test
    public void test() {
//        String s = "a good   example";
        String s = "the sky is blue";
        String s1 = reverseWords(s);
        System.out.println(s1);
    }

    public String reverseWords(String s) {


        StringBuilder sb = removeEmpty(s);

        reverseString(sb, 0, sb.length() - 1);

        reverseEachWord(sb);

        return sb.toString();
    }

    public StringBuilder removeEmpty(String s) {
        int start = 0;
        int end = s.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (s.charAt(start) == ' ') {
            start++;
        }

        while (s.charAt(end) == ' ') {
            end--;
        }


        while (start <= end) {

            char c = s.charAt(start);

            if(c != ' ' || sb.charAt(sb.length() - 1) != ' ') {
                sb.append(c);
            }
            start++;
        }
        return sb;
    }

    public void reverseString(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }

    public void reverseEachWord(StringBuilder sb) {

        int left = 0;
        int right = 0;
        while (right <= sb.length()) {
            if(right == sb.length() || sb.charAt(right) == ' ') {
                reverseString(sb, left, right - 1);
                left = right + 1;
            }
            right++;
        }

    }
}

