package LinkedList;
import java.util.*;
public class ListEnteredByUser {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next= null;
        }
    }
    static void printlist(Node h){
        while(h!= null){
            System.out.print(h.data+"->");
            h=h.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the size of the linked list");
        int n = scanner.nextInt();
        System.out.println("now enter the element of the linked list");
        int i=0;
        Node head;
        do {
            Node temp = new Node(scanner.nextInt());
            head = temp;
            temp= temp.next;
            i++;
        }while (i<n);
        printlist(head);
    }
}
