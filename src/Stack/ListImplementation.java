package Stack;

import java.util.Scanner;

public class ListImplementation {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    static class Stack{
        private Node head = null;
        private int sz=0;
        void push(int ele){
            Node temp = new Node(ele);
            temp.next=head;
            head=temp;
            sz++;
        }
        int size(){
            return sz;
        }
        private void displayRec(Node temp){
            if (temp==null) return;
            displayRec(temp.next);
            System.out.print(temp.data+" ");
        }
        int pop(){
            if (head==null){
                System.out.println("Stack is empty please enter something");
                return -1;
            }
            int t = head.data;
            head = head.next;
            sz--;
            return t;
        }
        boolean isEmpty(){
            if (head==null) return true;
            return false;
        }
        int peak(){
            if (head==null) {
                System.out.println("Stack is empty please enter something");
                return -1;
            }
            return head.data;
        }
        void display(){
            displayRec(head);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack st = new Stack();
        System.out.println(st.peak());//try to peak the empty stack return -1
        System.out.println(st.pop());//try to pop the empty stack return -1
        System.out.println("size:" + st.size());//return the size of the stack 0
        st.push(10);//push a single element
        //after pushing try to find the size
        System.out.println("after push size:" + st.size());//1
        System.out.println(st.peak());//try to peak the empty stack return the ele (10)
        //after push check for empty stack
        System.out.println("is stack empty:" + st.isEmpty());
        System.out.println(st.pop());//try to pop the empty stack return 10
        //after pop check for empty stack
        System.out.println("is stack empty:" + st.isEmpty());
        //lets full the stack
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        //print stack
        System.out.println();
        st.push(5);
        st.push(5);
        st.display();

    }
}
