import java.util.HashMap;
//for question4

public class Main {
    public static void main(String[] args) {
        String s = "dabcdddabcbb";
        System.out.println(LongestSubstring(s));

    }

    public static String LongestSubstring(String s) {
        if (s.length() == 0) {
            return "";
        }
        int max = 0;
        int start = 0;
        int end = 0;
        int temp = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; i < s.length(); ++i) {
            //if map already have this letter
            //j move forward
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            //record the position of start of the string
            map.put(s.charAt(i), i);
            temp = max;
            max = Math.max(max, i - j + 1);
            if (temp != max) {
                start = j;
                end = i;
            }
        }
        s = s.substring(start,end + 1);
        return s;
    }
}
