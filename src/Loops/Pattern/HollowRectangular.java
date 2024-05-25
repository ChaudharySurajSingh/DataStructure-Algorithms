package Loops.Pattern;

import java.util.Scanner;

public class HollowRectangular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int r= scanner.nextInt();
        System.out.println("Enter the number of column");
        int c = scanner.nextInt();
        for (int i = 1; i <=r; i++) {
            for (int j = 1; j <=c; j++) {
                if (i==1||i==r||j==1||j==c)
                    System.out.print('*'+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
