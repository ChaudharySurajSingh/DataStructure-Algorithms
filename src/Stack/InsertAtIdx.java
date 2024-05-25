package Stack;

import java.util.*;

public class InsertAtIdx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter the size of the stack");
        int size = scanner.nextInt();
        System.out.println("Enter the element of stack");
        for (int i = 0; i <size; i++) {
            st.push(scanner.nextInt());
        }
        System.out.println(st);
        System.out.println("Enter the element and the index to insert in the stack");
        int ele = scanner.nextInt();
        int idx = scanner.nextInt();
        Stack <Integer> temp = new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(ele);
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        System.out.println(st);

    }
}
