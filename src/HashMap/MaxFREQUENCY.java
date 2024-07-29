package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxFREQUENCY {
    static void maxfeq(int[] a){
        Map<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i <a.length ; i++) {
            if (!map.containsKey(a[i])) map.put(a[i],1);
            else {
                map.put(a[i],map.get(a[i])+1);
            }
        }
        System.out.println(map);
        int maxfreq = -1;
        int ele = -1;
        for (int key: map.keySet()){
            if (map.get(key)> ele){
                ele = key;
                maxfreq = map.get(key);
            }
        }
        System.out.println("the most frequent element is " +ele +" it occurs " +maxfreq+" times");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of the array");
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        maxfeq(arr);
    }
}
