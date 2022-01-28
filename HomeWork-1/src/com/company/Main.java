package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String str1 = "ABCDE";

        String str2 = "abbaca";

        String str3 = "MCMXCIV";

        int n = 15;

        String str5 = "loveleetcode";

        String str6a = "199";
        String str6b = "87";

        String str7 = "()[]{}";

        String str8 = "A man, a plan, a canal: Panama";

        String str9 = "abca";

        System.out.println("------------TEST CASES------------");
        System.out.println("Q1---reversed string: " + reverseString(str1));
        System.out.println("Q2--removed dup string: "+ removeDup(str2));
        System.out.println("Q3--string to Roman Integer: " + romanToInt(str3));
        System.out.println("Q4--FizzBuzz " + n + ": " + fizzBuzz(n));
        System.out.println("Q5--index of the first non-repeating character: " + firstUniqChar(str5));
        System.out.println("Q6--sum of " + str6a + " + " + str6b +" is: " + addStrings(str6a,str6b));
        System.out.println("Q7--" + str7 + " is Valid Parentheses? " + isValidParentheses(str7));
        System.out.println("Q8--" + str8 + "is Valid Palindrome? " + isPalindrome(str8));
        System.out.println("Q9--" + str9 + "is Valid Palindrome after deleting at most one character from it?" + isValidPalindrome2(str9));
    }

    //question 1 : Reverse a string
    private static String reverseString(String str) {
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(arr);
    }

    //question 2 : Remove All Adjacent Duplicates In String
    private static String removeDup(String S) {
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) {
            int size = sb.length();
            if (size > 0 && sb.charAt(size-1)==c) {
                sb.deleteCharAt(size-1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    //question 3 : Roman to Integer
    private static int romanToInt(String s) {
        int n = 0;
        char prev = ' ';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            n += getValue(c,prev);
            prev = c;
        }
        return n;
    }

    private static int getValue(char c, char prev) {
        switch (c) {
            case 'I':
                return 1;
            case'V':
                return prev == 'I'? 3 : 5;
            case'X':
                return prev == 'I'? 8 : 10;
            case'L':
                return prev =='X'? 30 : 50;
            case'C':
                return prev =='X'? 80 : 100;
            case'D':
                return prev == 'C'? 300 : 500;
            case'M':
                return prev =='C'? 800 : 1000;
        }
        return -1;
    }

    //question 4 : Fizz Buzz
    private static List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res.add("FizzBuzz");
            } else if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else {
                res.add(String.valueOf(i));
            }
        }
        return res;
    }

    //question 5 : First Unique Character in a String
    private static int firstUniqChar(String s) {
        for (char c : s.toCharArray()) {
            int index = s.indexOf(c);
            int lastIndex = s.lastIndexOf(c);
            if (index == lastIndex) {
                return index;
            }
        }
        return -1;
    }

    //question 6 : Add Strings
    private static String addStrings(String num1, String num2){
        int i = num1.length() -1;
        int j = num2.length() -1;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        while(i >= 0|| j >= 0|| carry > 0 ) {
            int n1 = 0;
            int n2 = 0;
            if (i >= 0) {
                n1 = num1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                n2 = num2.charAt(j) -'0';
                j--;
            }

            int n = (n1 + n2 + carry) % 10;
            carry = (n1 + n2 + carry) >= 10? 1:0;
            res.append(n);
        }
        return res.reverse().toString();
    }

    //question 7 : Valid Parentheses
    private static boolean isValidParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else {
                if (st.isEmpty()){
                    return false;
                }
                char leftC = st.pop();
                if (leftC == '(' && c != ')' ) {
                    return false;
                }
                if (leftC == '[' && c != ']' ) {
                    return false;
                }
                if (leftC =='{' && c != '}' ) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    //question 8 : Valid Palindrome
    private static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c:s.toCharArray()){
            if (Character.isDigit(c) || Character.isLetter(c)){
                sb.append(c);
            }
        }
        String fixed = sb.toString();
        fixed = fixed.toLowerCase();
        int start = 0; int end = fixed.length()-1;
        while(start <= end) {
            if(fixed.charAt(start) != fixed.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    //question 9 : Valid Palindrome II
    private static boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    private static boolean isValidPalindrome2(String s) {
        int start = 0; int end = s.length()-1;
        while (start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                return isPalindrome(s,start+1,end) || isPalindrome(s,start,end-1);
            }
            start++;
            end--;
        }
        return true;
    }








}
