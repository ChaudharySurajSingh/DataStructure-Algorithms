/*
121212
212121
121212
212121
*/
package Loops.Pattern;
import java.util.Scanner;
public class wierdPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int r = scanner.nextInt();
        System.out.println("Enter the number of column");
        int c = scanner.nextInt();
        for (int i = 1; i <=r ; i++) {
            for (int j = 1; j <=c; j++) {
                if ((i+j)%2==0){
                    System.out.print(2);
                }
                else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}
