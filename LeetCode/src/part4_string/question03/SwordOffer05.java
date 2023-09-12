package part4_string.question03;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-09-02-20:43
 */
public class SwordOffer05 {
    public String replaceSpace(String s) {
        if (s.length() == 0) {
            return s;
        }

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                str.append("  ");
            }
        }

        if(str.length() == 0) {
            return s;
        }

        int left = s.length() - 1;
        s += str.toString();
        int right = s.length() - 1;

        char[] chars = s.toCharArray();
        while (left < right) {
            if(chars[left] == ' ') {
                chars[right--] = '0';
                chars[right--] = '2';
                chars[right] = '%';
            }else {
                chars[right] = chars[left];
            }
            right--;
            left--;
        }
        return new String(chars);
    }
}


