package recurssion;

import java.util.Scanner;

public class Fibonacci {
    static int fab(int n){
        if(n==1||n==0) return n;
        return fab(n-1)+fab(n-2);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scanner.nextInt();
        System.out.println(fab(n));
    }
}
