package miselinious;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number to find the exponent");
        int n= scanner.nextInt();
        System.out.println("enter the value of the exponent");
        int m=scanner.nextInt();
        int ans=1;
        while(m>0){
            ans = ans*n;
            m--;
        }
        System.out.println("exponent of "+n +" is "+ans);
    }
}
