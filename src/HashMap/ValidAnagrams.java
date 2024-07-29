package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ValidAnagrams {
    static boolean anagram(String a, String b) {
        if (a.length() != b.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (map.containsKey(ch)) map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
        }
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            if (!map.containsKey(ch)) return false;
            map.put(ch, map.get(ch) - 1);
        }
        if (map.isEmpty()) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str = scanner.nextLine();
        System.out.println("Enter the second string");
        String str2 = scanner.nextLine();
        System.out.println(anagram(str, str2));
    }
}
