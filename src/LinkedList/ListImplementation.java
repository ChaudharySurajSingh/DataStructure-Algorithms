package LinkedList;

import java.util.Scanner;

public class ListImplementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
     public static class linkedList{
         Node head = null;
         Node tail = null;
         void add(int d){
             Node temp = new Node(d);
             if (head==null){
                 head = temp;
//               tail = head;
             }
             else {
                 tail.next= temp;
//                tail = temp;
             }
             tail = temp;
         }
         void insertAt(int idx, int v){
             if (head == null) {
                add(v);
             }
             else if(idx==0){
                 insertAtBeg(v);
             }
             else if (idx==size()){
                 add(v);
             } else if (idx<0) {
                 System.out.println("invalid index! please enter a valid index");
             }
             else {
                 Node t = new Node(v);
                 Node temp = head;
                 for (int i = 0; i <idx-1; i++) {
                     temp= temp.next;
                 }
                 t.next = temp.next;
                 temp.next= t;
             }
         }
         void insertAtBeg(int a){
             Node temp = new Node(a);
             if (head == null){
                 head =temp;
             }
             else {
                 temp.next = head;
                 head=temp;
             }

         }
         void getEle(int idx){
             if (head==null){
                 System.out.println("Empty list!!");
             } else if (idx>size()||idx<0) {
                 System.out.println("index outOfBound Enter a valid index");
             }
             else {
                 Node temp = head;
                 for (int i = 0; i <idx; i++) {
                     temp= temp.next;
                 }
                 System.out.println(temp.data);
             }
         }
         void display(){
             Node temp = head;
             while(true){
                 if (temp.next==null){
                     System.out.print(temp.data+" -> null\n");
                     break;
                 }
                 else{
                     System.out.print(temp.data+" -> ");
                 }
                 temp= temp.next;
             }
         }
         int size(){
             Node temp = head;
             int count=0;
             while(temp!= null){
                 count++;
                 temp = temp.next;
             }
             return count;
         }
     }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        linkedList ll = new linkedList();
        System.out.println("Enter the initial size of the linked list:");
        int size = scanner.nextInt();
        System.out.println("enter the element of the linked list:");
        for (int i = 0; i < size; i++) {
            ll.add(scanner.nextInt());
        }
        System.out.println("the linked list you have entered is:");
        ll.display();
        ll.insertAtBeg(111);
        ll.display();
        ll.insertAt(3,3333);
        ll.display();
        ll.insertAt(7,5555);
        ll.display();
        System.out.println(ll.tail.data);
        System.out.println(ll.head.data);
        ll.insertAt(7,7777);
        ll.display();
        System.out.println(ll.tail.data);
        ll.getEle(85);
    }
}

