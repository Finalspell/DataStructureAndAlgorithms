package part3_hashtable.question01;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-08-28-20:42
 */
public class LeetCode242 {
    public boolean isAnagram(String s, String t) {

        int[] arr = new int[26];//将数组作为存储26个字母出现次数的哈希表，讲26个字母映射为数组的下标也就是哈希表的关键码

        char[] charArray1 = s.toCharArray();
        for (char ch :charArray1){
            arr[ch - 'a']++;
        }

        char[] charArray2 = t.toCharArray();
        for (char ch : charArray2) {
            arr[ch - 'a']--;
        }

        for (int i : arr) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }
}
