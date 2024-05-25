package miselinious;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find factorial");
        int n = scanner.nextInt();
        long fact=1;
        int i=1;
        while (i<=n){
            fact*=i;
            System.out.println("factorial of:"+i+" is:"+fact);
            i++;
        }
    }
}
