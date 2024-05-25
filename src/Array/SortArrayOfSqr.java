package Array;

import java.util.Scanner;

public class SortArrayOfSqr {
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
    static int[] sortSqr(int[]a){
        int left =0,right= a.length-1;
        int n = a.length;
        int[]arr = new int[n];
        while (left<right){
            if (Math.abs(a[left])>Math.abs(a[right])){
                arr[--n]=a[left]*a[left];
                left++;
            }else{
                arr[--n]=a[right]*a[right];
                right--;
            }
        }
        return arr;
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
        System.out.println("after find the square");
        printArray(sortSqr(arr));
    }
}
