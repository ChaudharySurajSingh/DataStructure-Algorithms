//find the sum of the series; 1-2+3-4+5.....n.
package miselinious;

import java.util.Scanner;

public class SumOfAltSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int num = scanner.nextInt();
        int sum=0;
        for (int i = 1; i <=num ; i++) {
            if (i%2==0) sum-=i;
            else sum+=i;
        }
        System.out.println("sum of the series is:"+sum);
    }
}
