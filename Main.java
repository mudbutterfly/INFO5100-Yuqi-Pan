import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Q1.Valid Parentheses
        System.out.println("valid parentheses:");
        String s = "()[]{}";
        System.out.println(isValidParentheses(s));

        //Q2.Compress a String
        System.out.println("String after compressed:");
        String s2 = "aabcccccaaa";
        String s22 = "ab";
        System.out.println(compressString(s2));
        System.out.println(compressString(s22));

        //Q3.length of longest substring without repeating character
        System.out.println("Length of longest substring:");
        String s3 = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s3));

        //Q4.array of sum add up to zero
        System.out.println("array of sum add up to zero:");
        int[] resArray = sumZero(6);
        for (int n : resArray) {
            System.out.println(n);
        }

        //Q5.Kth large element in the array
        System.out.println("Kth Largest element:");
        int[] nums = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(nums,4));


    }

    //Q1.Valid Parentheses
    public static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                //left parentheses into the stack so when it pop out it will be in valid closing order
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char left = stack.pop();
                if (left == '(' && c != ')') return  false;
                if (left == '{' && c != '}') return false;
                if (left == '[' && c != ']') return false;
            }
        }
        return stack.isEmpty();
    }

    //Q2.Compress String
    public static String compressString(String s) {
        int len = s.length();
        //a string has to be at least longer than 2 to be compressed
        if (len > 2) {
            String res = "";
            char curChar = s.charAt(0);
            //initialize the freq of the letter to be 1
            int count = 1;
            for (int i = 1; i < len; i++) {
                if (curChar == s.charAt(i)) {
                    //repeating
                    count++;
                } else {
                    //not repeating
                    res += Character.toString(curChar) + Integer.toString(count);
                    curChar = s.charAt(i);
                    //set count back to 1
                    count = 1;
                }
            }
            //includes in the last character
            res += Character.toString(curChar) + Integer.toString(count);
            if (res.length() < len) {
                return res;
            }
        }
        return s;
    }

    //Q3.length Of LongestSubstring
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int max =  0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0, j = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                //update start position
                j = Math.max(j,map.get(s.charAt(i)) + 1);
            }
            //if first time appearing, record position
            map.put(s.charAt(i), i);
            //updating max len
            max = Math.max(max, i - j +1);
        }
        return max;
    }

    //Q4.sum up to zero
    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            //i*2 - n will get one negative and one positive to add up to zero, add 1 to avoid get 2 zeros
            arr[i] = i *2 - n + 1;
        }
        return arr;
    }

    //Q5.find Kth Largest num
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o1-o2);
        for (int n : nums) {
            //adding the num to maxHeap, biggest will be the last, smallest will be at the front of the que
            maxHeap.add(n);
            if (maxHeap.size() > k) {
                //remove all the smallest in que
                maxHeap.poll();
            }
        }
        //the item get polled will be kth large
        return maxHeap.poll();
    }
}

