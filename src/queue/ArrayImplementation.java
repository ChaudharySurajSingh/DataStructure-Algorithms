package queue;

public class ArrayImplementation {

    // Inner class 'queue' representing a queue implemented using an array
    public static class queue {
        // Array to store the elements of the queue
        private int[] arr = new int[10];
        // Front pointer to track the front of the queue
        private int f = 0;
        // Rear pointer to track the rear of the queue
        private int r = -1;
        // Size to track the number of elements in the queue
        private int s = 0;

        // Method to add an element to the queue
        public void add(int ele) {
            // Check if the rear pointer has reached the array length, indicating full capacity
            if (r == arr.length - 1) {
                System.out.println("capacity full");
                return;
            } else {
                // Increment the rear pointer and add the element to the array
                arr[++r] = ele;
                // Increment the size counter
                s++;
            }
        }
        public int peek(){
            if(s==0){
                System.out.println("queue is empty nothing to return");
                return -1;
            }
            return arr[f];
        }

        // Method to remove an element from the queue
        public int remove() {
            // Check if the queue is empty
            if (r < f) {
                System.out.println("no element to remove");
                return -1;
            } else {
                // Decrement the size counter and return the front element, then increment the front pointer
                s--;
                return arr[f++];
            }
        }

        // Method to get the size of the queue
        public int size() {
            return s;
        }
        public void display(){
            if (s==0){
                System.out.println("nothing to display");
                return;
            }
            for (int i = f; i <= r; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create an instance of the queue
        queue q = new queue();
        // Print the initial size of the queue
        System.out.println(q.size());
        q.display();
        // Add an element to the queue
        q.add(1);
        // Print the size of the queue after adding an element
        System.out.println(q.size());
        // Remove an element from the queue and print the removed element
        System.out.println(q.remove());
        // Print the size of the queue after removing an element
        System.out.println(q.size());
        // Add multiple elements to the queue
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        // Print the size of the queue after adding multiple elements
        System.out.println(q.size());
        // Remove an element from the queue and print the removed element
        System.out.println(q.remove());
        // Print the size of the queue after removing an element
        System.out.println(q.size());
        q.display();

    }
}