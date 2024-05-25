package Loops.Pattern;

import java.util.Scanner;

public class TriangleOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int r = scanner.nextInt();
        for (int i = 1; i <=r; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
