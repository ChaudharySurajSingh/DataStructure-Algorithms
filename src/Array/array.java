package Array;

import java.util.Scanner;

public class array {
   static int findEle(int[] arr,int e){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==e) return i;
        }
        return -1;
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
        for (int i = 0; i <size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("Enter the element to find");
        int ele = scanner.nextInt();
        System.out.println(findEle(arr,ele));
    }


}
