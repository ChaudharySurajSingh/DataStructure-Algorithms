package Array;

import java.util.Scanner;

public class RotateArrayByk {
    static  void printArray(int[]a){
        for (int ele:a){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void swap(int[]a,int i,int j ){
        while (i<j){
            a[i] = a[i]+a[j];
            a[j] = a[i]-a[j];
            a[i]=a[i]-a[j];
            i++;j--;
        }
    }
    static int[] rotate(int[]arr,int k ){
        k%=arr.length;
        int i=0,j=arr.length-1;
        swap(arr,i,j);
        swap(arr,i,k-1);
        swap(arr,k,j);
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
        System.out.println("Enter the step to rotate the array");
        int k = scanner.nextInt();
        printArray(rotate(arr,k));

    }
}
