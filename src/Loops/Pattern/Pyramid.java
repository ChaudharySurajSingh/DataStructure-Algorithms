package Loops.Pattern;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int r = scanner.nextInt();
        for (int i = 1; i<=r; i++) {
            for (int j = 0; j <r-i; j++) {
                System.out.print(' ');
            }
            for (int k = 0; k <2*i-1; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
