package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubsequence {
    static int sequence(int[] a){
        HashSet<Integer> set = new HashSet<>();
        for(int num:a){
            set.add(num);
        }
        int maxStreak=0;
        for(int ele:set){
            if(!set.contains(ele-1)){
                int currNum = ele;
                int streak=1;
                while(set.contains(currNum+1)){
                    streak++;
                    currNum++;
                }
                maxStreak= Math.max(maxStreak,streak);
            }

        }
        return maxStreak;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = scanner.nextInt();
        System.out.println("now enter the element of the array");
        int [] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=scanner.nextInt();
        }
        System.out.println("the length of consecutive sequence is "+sequence(arr));
    }
}
