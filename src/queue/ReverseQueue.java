package queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        Stack<Integer> st = new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        while (!st.isEmpty()){
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
