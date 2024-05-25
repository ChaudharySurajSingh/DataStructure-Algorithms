package Loops.Pattern;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of row of the triangle");
        int r= scanner.nextInt();
        for (int i = 1; i <=r; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
