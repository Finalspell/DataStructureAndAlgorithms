package part5_double_finger_needle.question03;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-09-07-20:50
 */
public class SwordOffer05 {
    public String replaceSpace(String s) {
        if (s.length() == 0) return s;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                sb.append("  ");
            }
        }

        if (sb.length() == 0) {
            return s;
        }

        int left = s.length() - 1;
        s += sb.toString();
        int right = s.length() - 1;

        char[] chars = s.toCharArray();

        while (left < right) {
            if (chars[left] == ' ') {
                chars[right--] = '0';
                chars[right--] = '2';
                chars[right] = '%';
            } else {
                chars[right] = chars[left];
            }
            right--;
            left--;
        }
        return new String(chars);
    }
}
