package Stack;

import java.util.Scanner;

public class ArrayImplementation {
    public static class Stack{
        int [] arr= new int[5+1];//give a 1 space extra to hold 1 based indexing
        int idx=0 ;

        void push(int ele){
            if (isFull()){
                System.out.println("Stack is full already");
                return;
            }
            arr[++idx]=ele;
        }
        int size(){
            return idx;
        }
        int pop(){
            if (idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            else {
                return arr[idx--];
            }
        }
        int peak(){
            if (idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx];
        }
        boolean isFull(){
            if (idx>=arr.length-1){
                return true;
            }
            return false;
        }
        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }
        void Print(){
            for (int i = 1; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack st = new Stack();
        System.out.println(st.peak());//try to peak the empty stack return -1
        System.out.println(st.pop());//try to pop the empty stack return -1
        System.out.println("size:"+st.size());//return the size of the stack 0
        st.push(10);//push a single element
        //after pushing try to find the size
        System.out.println("after push size:"+st.size());//1
        System.out.println(st.peak());//try to peak the empty stack return the ele (10)
        //after push check for empty stack
        System.out.println("is stack empty:"+st.isEmpty());
        System.out.println(st.pop());//try to pop the empty stack return 10

        //after pop check for empty stack
        System.out.println("is stack empty:"+st.isEmpty());
        //checking for full stack
        System.out.println("is stack full:"+st.isFull());
        //lets full the stack
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        //print stack
        st.Print();
        //check for full
        System.out.println("is stack full:"+st.isFull());


    }
}
