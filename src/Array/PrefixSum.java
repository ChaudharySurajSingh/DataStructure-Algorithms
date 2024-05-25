package Array;

import java.util.Scanner;

public class PrefixSum {
    static void printArray(int[]a){
        for (int ele:a){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int sum=0;
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <size; i++) {
            arr[i]= scanner.nextInt();
        }
        printArray(arr);
        for (int i = 1; i < arr.length ; i++) {
            arr[i]+=arr[i-1];
        }
        System.out.println("the prefix sum of the array is");
        printArray(arr);
    }
}
