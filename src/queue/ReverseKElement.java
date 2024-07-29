package queue;

import java.util.*;

public class ReverseKElement {
    static void reverse(Queue<Integer>q,int k){
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        for (int i = 0; i < n; i++) {
            st.push(q.remove());
        }
        while (!st.isEmpty()) q.add(st.pop());
        for (int i =0; i < n-k; i++) {
            st.push(q.remove());
        }while (!st.isEmpty()) q.add(st.pop());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the Queue");
        int n=  scanner.nextInt();
        Queue<Integer> q = new LinkedList<>();
        System.out.println("Enter the element of the Queue");
        for (int i = 0; i <n; i++) {
            q.add(scanner.nextInt());
        }
        System.out.println("You have entered: "+q);
        System.out.println("Enter the step to rotate");
        int k = scanner.nextInt();
        reverse(q,k);
        System.out.println("The rotated queue is: "+q);
    }
}
