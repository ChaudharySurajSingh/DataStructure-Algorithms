package Array;

import java.util.Scanner;

public class SumOfEle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int sum=0;
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <size; i++) {
            arr[i]= scanner.nextInt();
        }
        for (int i = 0; i <size; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i <size ; i++) {
            sum+=arr[i];
        }
        System.out.println("The sum of element of the array is:"+sum);
    }
}
