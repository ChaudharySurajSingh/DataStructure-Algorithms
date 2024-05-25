package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Implementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter the size of the stack");
        int size = scanner.nextInt();
        System.out.println("Enter the element of the stack");
        for (int i = 0; i <size; i++) {
            st.push(scanner.nextInt());
        }
        System.out.println("Stack you have entered");
        System.out.println(st);

    }
}
