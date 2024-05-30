package Stack;

import java.util.Scanner;
import java.util.Stack;

public class DisplayRev {
    static void printRec(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top+" ");
        printRec(st);
        st.push(top);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter the size of the stack");
        int size = scanner.nextInt();
        System.out.println("Enter the element of stack");
        for (int i = 0; i < size; i++) {
            st.push(scanner.nextInt());
        }
        printRec(st);
        System.out.println(st);
    }
}
