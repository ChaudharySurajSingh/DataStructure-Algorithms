package Stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGrater {
    public static int[] next(int[]arr){
        int n = arr.length;
        int []res= new int[n];
        Stack<Integer> st = new Stack<>();
        //put the last element in the stack and start traversing the array from the second last element
//        st.push(arr[n-1]);
//        res[n-1]=-1;
        for (int i = n-1; i >=0; i--) {
            while(!(st.isEmpty())&&arr[i]>st.peek()){
                st.pop();
            }
            //if stack is empty put -1 in the resultant array
            if (st.isEmpty())res[i]=-1;
            //if stack is not empty put the peek in the resultant array
            else res[i]=st.peek();
            //push the element in the stack
            st.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = scanner.nextInt();
        int[]arr = new int[n];
        System.out.println("Now enter the element of the array");
        for (int i = 0; i <n ; i++) {
            arr[i]= scanner.nextInt();
        }
        System.out.println("The resultant array is");
        int []ans =next(arr);
        for (int i = 0; i <ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

}
