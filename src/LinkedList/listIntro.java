package LinkedList;

public class listIntro {
    static class Node{
        int data;
        Node Next;
        Node(int data){
            this.data = data;
            this.Next= null;
        }
    }
    public static void main(String[] args) {
        Node n1 = new Node(2);
        Node n2= new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(6);
        System.out.println(n1.Next);
        n1.Next = n2;
        System.out.println(n1);
        System.out.println(n1.Next);
        System.out.println(n2);
    }
}
