package recurssion;

import java.util.Scanner;

public class SumOfDigit {
    static int sod(int n) {
        if (n ==0) return 0;
        return  n % 10+sod(n / 10);
    }
    static int cod(int n) {
        if (n ==0) return 0;
        return  1+cod(n / 10);
    }
    static int pow(int n,int a) {
        if (a ==0) return 1;
        return  n*pow(n,a-1);
    }
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the value of n");
            int n = scanner.nextInt();
            System.out.println(sod(n));
            System.out.println(cod(n));
            System.out.println(pow(n,n));
        }

}
