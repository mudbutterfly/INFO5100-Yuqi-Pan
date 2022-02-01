package Assignment1_Yuq_Pan;

public class Main {

    public static void main(String[] args) {
        String str1 = "abcdcba";
        String str2 = "abcdae";
        String str3 = "abcdaed";
        String str4a = "god"; String str4b = "dog";
        int n5 = 2000;
        int n6 = 210;
        String ransom = "apple"; String magazine = "redapple";
        String str8 = "A";

        Book book1 = new Book("Java001",123,"lecture",20);
        Box box1 = new Box(10,22,15);

        System.out.println("Q1: "+ str1 + " is palindrome? -" + isPalindrome(str1));
        System.out.println("Q2: "+ str2 + " has all unique characters? -" + allUnique(str2));
        System.out.println("Q3: "+ str3 + " contains duplicates? -" + hasDup(str3));
        System.out.println("Q4: "+ str4a + " and "+ str4b +" are anagrams? -" + anagram(str4a,str4b));
        System.out.println("Q5: "+ n5 +" is leep year? -" + leepYear(n5));
        System.out.println("Q6: " + " price for " + n6 + " calls is " + phoneBill(n6));
        System.out.println("Q7: " + ransom + " can be constructed by " + magazine + " ? -" + canConstruct(ransom,magazine));
        System.out.println("Q8: "+ str8 + " is -"); promptsGrade(str8);
        System.out.println("Q10: the volume of the box is " + boxVolume(box1));

    }

    //Question 1: find if String is Palindrome
    private static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    //Question2: check if a string has all unique characters
    private static boolean allUnique(String s) {
        for (char c : s.toCharArray()) {
            int index = s.indexOf(c);
            int lastIndex = s.lastIndexOf(c);
            if (index != lastIndex) {
                return false;
            }
        }
        return true;
    }

    //Question 3: check if string contains duplicates
    private static boolean hasDup(String s) {
        for (char c : s.toCharArray()) {
            int index = s.indexOf(c);
            int last = s.lastIndexOf(c);
            if (index != last){
                return true;
            }
        }
        return false;
    }

    //Question 4: check if two strings are anagrams
    private static boolean anagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[24];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int n : count) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }

    //Question 5: determine whether the year is a leap year or not
    private static boolean leepYear(Integer year) {
        if (year%100 == 0) {
            return (year%4 == 0);
        } else {
            return (year%4 == 0);
        }
    }

    //Question 6: to calculate the monthly telephone bills
    private static int phoneBill(Integer call) {
        int numOfCall = (call - 100)/50;
        int pay = 200;
        switch (numOfCall) {
            case 0:
                pay += (call - 100)*0.6;
                break;
            case 1:
                pay += 30 + (call - 150)*0.5;
                break;
            default:
                pay += 55+ (call - 200)*0.4;
                break;
        }
        return pay;
    }

    //Question 7: return true if ransomNote can be constructed from magazine and false otherwise
    private static boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(--count[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    //Question 8 : a program that prompts the user’s grade
    private static void promptsGrade(String s) {
        switch (s) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Average");
                break;
            case "D":
                System.out.println("Deficient");
                break;
            case "F":
                System.out.println("Failing");
                break;
        }
    }

    //Question 9: create a book class.

    //Question 10: Implement class Box, function to calculate the box volume.
    private static double boxVolume(Box box) {
        return box.depth * box.height * box.width;
    }




}
