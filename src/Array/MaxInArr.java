package Array;

import java.util.Scanner;

public class MaxInArr {
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
        System.out.println();
        int max = -1;
        for (int i = 0; i <size ; i++) {
            if (arr[i]>max) max =arr[i];
        }
        System.out.println("the maximum in the array is: "+max);
    }
}
