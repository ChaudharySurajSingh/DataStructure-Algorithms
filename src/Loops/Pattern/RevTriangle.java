package Loops.Pattern;

import java.util.Scanner;

public class RevTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of row of the triangle");
        int r = scanner.nextInt();
        for (int i = r; i >0; i--) {
            for (int j = i; j >0; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
