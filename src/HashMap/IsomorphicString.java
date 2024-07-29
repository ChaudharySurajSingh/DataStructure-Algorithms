package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicString {
    static boolean isomorphic(String s, String t) {
        // Check if the lengths of the two strings are different
        if (s.length() != t.length()) return false; // If lengths are different, they cannot be isomorphic
        // Create a HashMap to store the mapping of characters from string s to string t
        HashMap<Character, Character> mp = new HashMap<>();
        // Iterate through each character of the strings
        for (int i = 0; i < s.length(); i++) {
            // Get the characters at position i in both strings
            Character sch = s.charAt(i);
            Character tch = t.charAt(i);
            // Check if the character from string s is already mapped
            if (mp.containsKey(sch)) {
                // If it is mapped to a different character in string t, return false
                if (mp.get(sch) != tch) return false;
            } else if (mp.containsValue(tch)) {
                // If the character from string t is already mapped to some other character from string s, return false
                return false;
            } else {
                // If the character from string s is not mapped yet, add the mapping to the HashMap
                mp.put(sch, tch);
            }
        }
        // If all characters are mapped correctly, return true
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string");
        String s = scanner.next();
        System.out.println("enter the second string");
        String t = scanner.next();
        boolean res = isomorphic(s,t);
        if (res) System.out.println("yes string's are isomorphic");
        else System.out.println("String's sre not isomorphic");

    }
}
