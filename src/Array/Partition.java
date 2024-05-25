package Array;

import java.util.Scanner;

import static Array.PrefixSum.printArray;

public class Partition{
    static  int totalSum(int[]a){
       int tsm=0;
        for (int i = 0; i <a.length ; i++) {
            tsm += a[i];
        }
        return tsm;
    }
    static boolean partition(int[]arr){
        int tsm = totalSum(arr);
        int pref = 0;
        for (int i = 1; i < arr.length ; i++) {
            pref+=arr[i-1];
            int sufx  = tsm-pref;
            if (pref==sufx){
                return  true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int sum = 0;
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        printArray(arr);
        System.out.println("partition "+ partition(arr) );
    }
}
