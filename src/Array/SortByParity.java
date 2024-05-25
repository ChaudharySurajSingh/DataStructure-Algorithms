package Array;

import java.util.Scanner;

public class SortByParity {
    static  void printArray(int[]a){
        for (int ele:a){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void swap(int[]a,int i,int j){
        while (i<j) {
            a[i] = a[i] + a[j];
            a[j] = a[i] - a[j];
            a[i] = a[i] - a[j];
            i++;
            j--;
        }
    }
    static void sort(int[]a){
        int left =0,right= a.length-1;
        while (left<right){
            if (a[left]%2!=0&&a[right]%2==0){
                swap(a,left,right);
            }
            if (a[left]%2==0) left++;
            if (a[right]%2!=0) right--;
        }
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
        System.out.println("after short by parity");
        sort(arr);
        printArray(arr);
    }
}
