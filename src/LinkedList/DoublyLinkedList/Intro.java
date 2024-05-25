package LinkedList.DoublyLinkedList;

public class Intro {
    static class Node{
       int data;
       Node next;
       Node prev;
       Node(int data){
           this.data = data;
           this.next = null;
           this.prev = null;
       }
    }
    static void printList(Node head){
        if (head==null) return;
        System.out.print(head.data+" ");
        printList(head.next);
    }
    static void printRev(Node tail){
        if (tail==null)return;
        System.out.print(tail.data+" ");
        printRev(tail.prev);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
//        a.prev = null;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.prev= d;
        d.prev= c;
        c.prev= b;
        b.prev = a;
        printList(a);
        System.out.println();
        printRev(e);
    }
}
