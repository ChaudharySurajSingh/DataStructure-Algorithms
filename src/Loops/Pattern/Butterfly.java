package Loops.Pattern;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of fin of the butterfly");
        int r = scanner.nextInt();
        for (int i = 1; i <=r; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            for (int j =1; j<=2*(r-i); j++) {
                System.out.print("  ");
            }
            for (int l = 1; l <=i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <=r ; i++) {
            for (int j = i; j <=r; j++) {
                System.out.print("* ");
            }
            for (int k = 2; k <=2*i-1 ; k++) {
                System.out.print("  ");
            }
            for (int l = i; l <=r; l++) {
                System.out.print("* ");

            }

            System.out.println();
        }
    }
}
