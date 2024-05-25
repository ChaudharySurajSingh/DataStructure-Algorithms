package Array._2array;

import java.util.Scanner;

public class Transpose {
    static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
//    static void swap(int i, int j){
//        i+=j;
//        j=i-j;
//        i = i-j;
//    }
    static void transpose(int[][]a,int r,int c){
        for (int i = 0; i <r; i++) {
            for (int j = i+1; j < c; j++) {
//                swap(a[i][j],a[j][i]);
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input for the first matrix
        System.out.println("Enter the number of rows for the first matrix:");
        int r1 = scanner.nextInt();
        System.out.println("Enter the number of columns for the first matrix:");
        int c1 = scanner.nextInt();
        int[][] matrix1 = new int[r1][c1];
        System.out.println("Enter " + (c1 * r1) + " elements for the first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix:");
        printMatrix(matrix1);
        System.out.println("after transpose");
        transpose(matrix1,r1,c1);
        printMatrix(matrix1);
    }
}
