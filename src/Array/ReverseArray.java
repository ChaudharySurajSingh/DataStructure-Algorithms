package Array;

import java.util.Scanner;

public class ReverseArray {
    static  void printArray(int[]a){
        for (int ele:a){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static int[] reverse(int[]a){
        int i = 0;
        int j = a.length-1;
        while (i<j){
            a[i] = a[i]+a[j];
            a[j] = a[i]-a[j];
            a[i]=a[i]-a[j];
            i++;j--;
        }
        return a;
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
        printArray(reverse(arr));
    }
}
