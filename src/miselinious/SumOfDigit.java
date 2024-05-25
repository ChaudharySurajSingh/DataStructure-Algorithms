package miselinious;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find the sum of digit");
        long num = scanner.nextLong();
        long sum = 0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        System.out.println("the sum of digit is::"+sum);
    }
}
