package Loops.Pattern;

import java.util.Scanner;

public class hollowPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            // Inner loop for printing spaces
            for (int j = 1; j <= n + i - 1; j++) {
                // Condition to print stars at the pyramid boundaries
                if (j == n - i + 1 || j == n + i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
