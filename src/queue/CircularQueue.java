//package queue;
//
//public class CircularQueue {
//    public static class cqa{
//        int[]arr = new int[5];
//        int f= 0;
//        int r=0;
//        int s=0;
//        void add(int ele) throws Exception {
//            if (s==arr.length) throw new Exception("queue is full");
////            else if (r<arr.length) {
////                arr[r++]= ele;
////            }
////            else {
////                r=0;
////                arr[r++]= ele;
////            }
//            arr[r] = ele;
//            r = (r + 1) % arr.length; // Wrap around using modulo
//            s++;
//        }
//        void display(){
//            if (s==0) {
//                System.out.println("Empty queue nothing to display");
//                return;
//            }
//            else if (f<r) {
//                for (int i = f; i <r; i++) {
//                    System.out.print(arr[i]+" ");
//                }
//            }
//            else{
//                for (int i = f; i <arr.length ; i++) {
//                    System.out.print(arr[i]+" ");
//                }
//                for (int i = 0; i <r; i++) {
//                    System.out.print(arr[i]+" ");
//                }
//            }
//            System.out.println();
//        }
//        int remove() throws Exception{
//            if (s==0) throw new Exception("nothing to remove");
////            else if (f== arr.length-1) {
////               int x= arr[f];
////               f=0;
////               s--;
////               return x;
////            }
////            else {
////                s--;
////                return arr[f++];
////            }
//            int x = arr[f];
//            f = (f + 1) % arr.length; // Wrap around using modulo
//            s--;
//            return x;
//
//        }
//        int peek() throws Exception{
//            if(s==0) throw new Exception("Empty Queue");
//            else return arr[f];
//        }
//        int size(){
//            return s;
//        }
//        boolean isEmpty(){
//            if(s==0) return true;
//            else return false;
//        }
//    }
//    public static void main(String[] args) throws Exception{
//        cqa q= new cqa();
////        System.out.println(q.remove());
//        System.out.println(q.s);
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        q.add(5);
//        q.display();
//        System.out.println(q.remove());
//        System.out.println(q.remove());
//        q.add(50);
//        q.display();
//        q.add(25);
//        q.display();
//        System.out.println(q.remove());
//        q.display();
//        q.add(11);
//        q.display();
//        System.out.println(q.peek());
////        q.add(11);
//    }
//}
package queue;

public class CircularQueue {
    // Inner class representing the circular queue
    public static class cqa {
        int[] arr = new int[5]; // Array to store queue elements
        int f = 0; // Front index, points to the front element
        int r = 0; // Rear index, points to the next available position
        int s = 0; // Size of the queue, number of elements currently in the queue

        // Method to add an element to the queue
        void add(int ele) throws Exception {
            // Check if the queue is full
            if (s == arr.length) {
                throw new Exception("queue is full");
            }

            // Add the element at the rear index
            arr[r] = ele;
            // Increment the rear index and wrap around using modulo
            r = (r + 1) % arr.length;
            // Increment the size of the queue
            s++;
        }

        // Method to display the elements of the queue
        void display() {
            // Check if the queue is empty
            if (s == 0) {
                System.out.println("Empty queue nothing to display");
                return;
            }

            // If front index is less than rear index, print elements in a straight loop
            if (f < r) {
                for (int i = f; i < r; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            // If front index is greater than or equal to rear index, print elements in two parts
            else {
                // Print from front index to the end of the array
                for (int i = f; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                // Print from the start of the array to the rear index
                for (int i = 0; i < r; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }

        // Method to remove an element from the queue
        int remove() throws Exception {
            // Check if the queue is empty
            if (s == 0) {
                throw new Exception("nothing to remove");
            }

            // Get the front element
            int x = arr[f];
            // Increment the front index and wrap around using modulo
            f = (f + 1) % arr.length;
            // Decrement the size of the queue
            s--;
            // Return the removed element
            return x;
        }

        // Method to get the front element without removing it
        int peek() throws Exception {
            // Check if the queue is empty
            if (s == 0) {
                throw new Exception("Empty Queue");
            }
            // Return the front element
            return arr[f];
        }

        // Method to get the size of the queue
        int size() {
            return s;
        }

        // Method to check if the queue is empty
        boolean isEmpty() {
            return s == 0;
        }
    }

    public static void main(String[] args) throws Exception {
        cqa q = new cqa();
        // Initially, print the size of the queue
        System.out.println(q.size());

        // Add elements to the queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // Display elements of the queue
        q.display();

        // Remove elements from the queue and print the removed element
        System.out.println(q.remove());
        System.out.println(q.remove());

        // Add more elements to the queue
        q.add(50);
        q.display();

        q.add(25);
        q.display();

        // Remove an element from the queue and display the queue
        System.out.println(q.remove());
        q.display();

        // Add another element to the queue and display the queue
        q.add(11);
        q.display();

        // Peek at the front element without removing it
        System.out.println(q.peek());
    }
}