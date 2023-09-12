package part3_hashtable.question06;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-08-31-20:07
 */
public class LeetCode383 {
    public boolean canConstruct1(String ransomNote, String magazine) {


        Map<Character, Integer> map = new HashMap<>();

        char[] charArray = magazine.toCharArray();
        char[] charArray1 = ransomNote.toCharArray();

        for (char c : charArray1) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : charArray) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) {
                return false;
            }
        }
        return true;
    }

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] hashArray = new int[26];

        char[] charArray = ransomNote.toCharArray();

        for (char c : charArray) {
            hashArray[c - 'a']++;
        }

        char[] charArray1 = magazine.toCharArray();
        for (char c : charArray1) {
            hashArray[c - 'a']--;
        }

        for (int i : hashArray) {
            if(i > 0) {
                return false;
            }
        }

        return true;
    }

}
