package Loops.Pattern;

import java.util.Scanner;

public class NumericalPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int r = scanner.nextInt();
        for (int i = 1; i <=r; i++) {
            for (int j = 1; j <=r-i; j++) {
                System.out.print(' ');
            }
            for (int k =1; k <=i; k++) {
                System.out.print(k);
            }
            for (int l = i-1; l >0; l--) {
                System.out.print(l);
            }
            System.out.println();
        }

    }
}
