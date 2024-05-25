package Array;

import java.util.Scanner;

public class SecondLargest {
    static  void printArray(int[]a){
        for (int ele:a){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static int max (int[]a){
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        for (int ele:a){
            if (ele> max) max = ele;
        }
        for (int ele:a){
            if (ele>sMax&&ele!=max) sMax = ele;
        }
        return sMax;
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
        System.out.println(max(arr));


    }
}
