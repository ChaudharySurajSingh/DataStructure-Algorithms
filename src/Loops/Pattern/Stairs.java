package Loops.Pattern;

import java.util.Scanner;

public class Stairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the count of the stairs");
        int r = scanner.nextInt();
        for (int i = 1; i <=r ; i++) {
            for (int j = 1; j <=r-i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=r; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
