package Stack;

import java.util.Scanner;
import java.util.Stack;

public class PushBottom {
    static void pushBottom(Stack<Integer> st,int ele) {
        if (st.isEmpty()){
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushBottom(st,ele);//recursively push the element in the bottom
        st.push(top);//push the element of the stack
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
        pushBottom(st,555);
        System.out.println(st);
    }
}
