package Loops.Pattern;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <6; j++) {
                System.out.print('*'+" ");
            }
            System.out.println();
        }
    }
}
