package queue;

public class LinkedListImplementation {
    static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class queue{
        node head = null;
        node tail=null;
        int s= 0;
        void add(int ele){
            node t= new node(ele);
            if (head==null){
                head=t;
                tail=t;
            }else {
                tail.next = t;
                tail= tail.next;
            }
            s++;
        }
        int remove(){
            if (head==null){
                System.out.println("nothing to remove");
                return -1;
            }
            else {
                int x = head.data;
                head=head.next;
                s--;
                return x;
            }
        }
        int peek(){
            if (head==null){
                System.out.println("empty queue!");
                return -1;
            }
            else return head.data;
        }
        void display(){
            if(head==null){
                System.out.println("nothing to display");
                return;
            }
            else {
                node temp = head;
                while (temp!=null){
                    System.out.print(temp.data+" ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }
        int size(){
            return s;
        }
        boolean isEmpty(){
            if(head==null) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        queue q = new queue();
        System.out.println("size:"+q.size());
        System.out.println("remove:"+q.remove());
        System.out.println("peek:"+q.peek());
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        System.out.println("size:"+q.size());
        System.out.println("remove:"+q.remove());
        System.out.println("after removing");
        System.out.println("size:"+q.size());
        q.display();
        System.out.println("peek:"+q.peek());
        q.add(100);
        q.display();
        System.out.println(q.isEmpty());
        System.out.println("peek:"+q.peek());



    }
}
