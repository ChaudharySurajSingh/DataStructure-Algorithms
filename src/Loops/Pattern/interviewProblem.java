package Loops.Pattern;

import java.util.Scanner;

public class interviewProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int r = scanner.nextInt();
        for (int i = 1; i <=r ; i++) {
            for (int j = 1; j <=i ; j++) {
                if (j == 1 || j == i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = r-1; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                if (j==1||j==i){
                    System.out.print(j);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
