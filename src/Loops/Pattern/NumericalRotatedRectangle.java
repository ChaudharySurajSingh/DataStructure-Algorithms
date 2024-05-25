package Loops.Pattern;
import java.util.Scanner;
public class NumericalRotatedRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int r = scanner.nextInt();
        for (int i = 1; i <=r; i++) {
            for (int j = i; j <=r; j++) {
                System.out.print(j+" ");
            }
            for (int k = 1; k <=i-1; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
