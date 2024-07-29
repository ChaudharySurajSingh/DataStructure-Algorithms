package queue;

public class CircularQueueLLImplementation {
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class CQL {
        node head = null;
        node tail = null;
        int s = 0;

        void addLast(int data) {
            node t = new node(data);
            if (head == null) {
                head = tail=t;
            } else {
                tail.next = t;
                tail = tail.next;
            }
            tail.next = head;
            s++;
        }
        void addFirst(int data){
            node t = new node(data);
            if (head==null){
                head=tail=t;
            }
            else{
                t.next=head;
                head=t;
            }
            tail.next=head;
            s++;
        }
        void add(int data){
            node t = new node(data);
            if (head==null){
                head=tail=t;
            }
            else{
                t.next=head;
                head=t;
            }
            tail.next=head;
            s++;
        }
        int removeFirst() throws Exception {
            if (head == null) throw new Exception("nothing to remove");
            int t = head.data;
            head = head.next;
            tail.next = head;
            s--;
            return t;
        }
        int removeLast() throws Exception {
            if (head == null) {
                throw new Exception("Nothing to remove");
            }
            int t = tail.data;
            if (head == tail) { // List has only one node
                head = tail = null;
            } else {
                node temp = head;
                while (temp.next != tail) { // Find the node before the last node
                    temp = temp.next;
                }
                temp.next = head; // Update the next pointer to maintain circular structure
                tail = temp; // Update the tail to the new last node
            }
            s--;
            return t;
        }
        int peek() throws Exception {
            if (head == null) throw new Exception("empty queue!");
            return head.data;
        }
        int size(){
            return s;
        }
        int getFirst()throws Exception{
            if (head==null) throw new Exception("empty queue");
            return head.data;
        }
        int getLast()throws Exception{
            if(head==null) throw new Exception("empty queue");
            return tail.data;
        }
        void display() throws Exception{
            if (head==null) throw new Exception("nothing to display");
            node temp = head;
            while (true){
                System.out.print(temp.data+" ");
                temp= temp.next;
                if (temp==head){
                    break;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        CQL cq = new CQL();
        cq.addLast(1);
        cq.addLast(2);
        cq.addLast(3);
        cq.addLast(4);
        cq.addLast(5);
        cq.display();
        cq.addFirst(100);
        cq.display();
        System.out.println(cq.peek());
        System.out.println(cq.removeFirst());
        cq.display();
        cq.removeLast();
        cq.display();
    }
}
