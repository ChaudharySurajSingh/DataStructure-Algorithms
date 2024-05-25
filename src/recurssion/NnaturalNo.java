package recurssion;

import java.util.Scanner;

public class NnaturalNo {
    static void printNatural(int n){
        if(n==0) return;
        printNatural(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scanner.nextInt();
        printNatural(n);

    }
}
