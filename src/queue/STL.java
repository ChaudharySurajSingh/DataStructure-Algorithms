package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class STL {
    public static void main(String[] args) {
        // we can implement the queue using the ArrayDeque and LinkedList class
        Queue<Integer> q = new ArrayDeque<>();
        //adding the element to the queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        //print the queue
        System.out.println(q);
        //performing the builtin operation of the queue
        //poll(): Retrieves and removes the head of this queue, or returns null if this queue is empty
        System.out.println(q.poll());

        //remove():Retrieves and removes the head of this queue.
        // This method differs from poll() only in that it throws an exception if this queue is empty
        System.out.println(q.remove());//1


        //peek():Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty
        System.out.println(q.peek());//2

        //element():Retrieves, but does not remove, the head of this queue.
        // This method differs from peek only in that it throws an exception if this queue is empty
        System.out.println(q.element());//2
        //isEmpty():Returns true if this collection contains no element
        System.out.println(q.isEmpty());//false

        //size():Returns:the number of elements in this collection
        System.out.println(q.size());
    }
}
