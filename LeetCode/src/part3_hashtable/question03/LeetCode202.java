package part3_hashtable.question03;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-08-30-20:41
 */
public class LeetCode202 {
    @Test
    public void test() {
        boolean happy = isHappy(19);
        System.out.println(happy);
    }

    public boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();

        int sum;
        int num = n;
        while (num != 1) {
            sum = 0;
            while (num > 0) {
                sum = sum + ((num % 10) * (num % 10));
                num /= 10;
            }
            if (set.contains(sum)) {
                return false;
            } else {
                set.add(sum);
            }
            num = sum;
        }
        return true;
    }
}

