package LinkedList;

import java.util.*;

public class LinkedListImplementationTest {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    static class linkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        void add(int v) {
            Node temp = new Node(v);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }
        void insertAtBeg(int v){
            Node temp = new Node(v);
            if (head!=null){
                temp.next= head;
                head= temp;
            }
            else {
                head = temp;
            }
            size++;
        }
        void insertAt(int idx, int v){
            Node temp = new Node(v);
            if (idx==0){
                insertAtBeg(v);
            } else if (idx==size) {
                add(v);
            }
            else {
                Node t = head;
                for (int i = 0; i < idx-1; i++) {
                    t = t.next;
                }
                temp.next= t.next;
                t.next = temp;
                size++;
            }
        }
        void remove(int idx){
            if (idx<0||idx>size-1) {
                System.out.println("invalid index please enter a valid index");
            } else if (idx==0) {
                head=head.next;
                size--;
            } else {
                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                if (idx== size-1){
                    tail = temp;
                }
                size--;
            }
        }
        void displayRec(Node n){
            if (n == null) {
                return;
            }
            System.out.print(n.data+" - ");
            displayRec(n.next);
        }
        void display() {
            Node temp = head;
            while(true) {
                if (temp.next == null) {
                    System.out.print(temp.data + " -> Null\n");
                    break;
                } else {
                    System.out.print(temp.data + " -> ");
                }
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        linkedList ll = new linkedList();
        System.out.println("Enter the size of the LinkedList: ");
        int size = scanner.nextInt();
        System.out.println("Enter the Element of the LinkedList:\n");
        for (int i = 0; i < size; i++) {
            ll.add(scanner.nextInt());
        }
        ll.display();
        ll.insertAtBeg(111111);
        ll.display();
        ll.insertAt(4,4444);
        ll.display();
        System.out.println(ll.size);
        ll.remove(0);
        ll.display();
        ll.remove(10);
        ll.display();
        System.out.println(ll.head.data +" "+  ll.tail.data);
        ll.remove(3);
        ll.display();
        System.out.println(ll.size);
//        System.out.println(ll.tail.next.next);
        ll.displayRec(ll.head);
    }
}
