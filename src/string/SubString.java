package string;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "abcd";
        for (int i = 0; i <=3; i++) {
            for (int j = i+1; j <= 4; j++) {
                System.out.print(str.substring(i,j));
            }
            System.out.println();
        }
        System.out.println(str.length());
    }
}
