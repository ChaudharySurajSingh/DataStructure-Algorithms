package Array._2array;

import java.util.Scanner;

public class multiplication {
    static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
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
        System.out.println("First Matrix:");
        printMatrix(matrix1);

        // Input for the second matrix
        System.out.println("Enter the number of rows for the second matrix:");
        int r2 = scanner.nextInt();
        System.out.println("Enter the number of columns for the second matrix:");
        int c2 = scanner.nextInt();
        int[][] matrix2 = new int[r2][c2];
        System.out.println("Enter " + (c2 * r2) + " elements for the second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Second Matrix:");
        printMatrix(matrix2);

        // Check if multiplication is possible
        if (c1 != r2) {
            System.out.println("Multiplication is not possible because the number of columns of the first matrix is not equal to the number of rows of the second matrix.");
        } else {
            // Multiplication of matrices
            int[][] result = new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            System.out.println("Resultant Matrix:");
            printMatrix(result);
        }
    }
}
