//package Loops.Pattern;
//import java.util.Scanner;
//public class HollowTriangleOfNumbers{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number of row");
//        int r = scanner.nextInt();
//        for (int i = 1; i <=r; i++) {
//            for (int j =1; j <= r-i; j++) {
//                System.out.print(' ');
//            }
//            for (int k = 1; k <=2*i-1; k++) {
//                if (k==i||k==r||k==2*i-1){
//                    System.out.print(k);
//                }else {
//                    System.out.print(' ');
//                }
//            }
//            System.out.println();
//        }
//    }
//}
package Loops.Pattern;
import java.util.Scanner;

public class HollowTriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r = scanner.nextInt();

        for (int i = 1; i <= r; i++) {
            // Printing leading spaces
            for (int j = 1; j <= r - i; j++) {
                System.out.print(' ');
            }

            // Printing the hollow triangle pattern
            for (int k = 1; k <= 2 * i - 1; k++) {
                // Print numbers only at the borders
                if (k == 1 || k == 2 * i - 1 || i == r) {
                    System.out.print(i);
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
