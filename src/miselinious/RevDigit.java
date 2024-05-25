package miselinious;

import java.util.Scanner;

public class RevDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to reverse");

        int num = scanner.nextInt();
        int t = num;
        int rev=0;
        while(num>0){
            rev = rev*10+num%10;
            num/=10;
        }
        System.out.println("Reverse of:"+t+" is:"+rev);
    }
}
