package LinkedList.DoublyLinkedList;
import java.util.*;

public class Implementation {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next= null;
            this.prev = null;
        }
    }
    static class dll{
        Node head= null;
        Node tail = null;
        int length=0;
        boolean isEmpty(){
            return head==null;
        }
        void display(Node head){
            if (head==null){
                System.out.println();
                return;
            }
            System.out.print(head.data+" ");
            display(head.next);
        }
        void init (int v){
            Node temp = new Node(v);
            if (isEmpty()){
                head = tail = temp;
            }
            else {
                tail.next = temp;
                tail.next.prev = tail;
                tail = tail.next;
            }
            length++;
        }
        void deleteHead(Node head){
            if(isEmpty()){
                System.out.println("list is already empty");
            }
            head = head.next;
            head.prev=null;
        }
        void insAtBeg(int v){
            Node temp = new Node(v);
            if(isEmpty()){
                head = tail = temp;
            }
            temp.next = head;
            head.prev = temp;
            head=temp;
            length++;
        }
        void insAt(int idx, int d){
            Node temp = new Node(d);
            if (idx<=0){
                insAtBeg(d);
            } else if (idx>=length) {
                tail.next = temp;
                tail.next.prev =tail;
                tail = tail.next;
            }
            else {
                int i = 1;
                Node current = head;
                while(i<idx){
                    current = current.next;
                    i++;
                }
                current.next.prev = temp;
                temp.prev = current;
                temp.next= current.next;
                current.next=temp;
            }
            length++;
        }
    }

    public static void main(String[] args) {
        dll dl = new dll();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of your linked list");
        int size = scanner.nextInt();
        System.out.println("Enter the element of the linked list");
        for (int i=0;i<size;i++){
            dl.init(scanner.nextInt());
        }
        dl.display(dl.head);
        dl.insAt(2,50);//insertion at the particular index
        dl.display(dl.head);
        dl.insAtBeg(500);//insertion at the beginning of the list
        dl.display(dl.head);
        dl.init(1000);//insertion at  the end of the list
        dl.display(dl.head);
        dl.insAt(50,11111);
        dl.display(dl.head);
    }

}
