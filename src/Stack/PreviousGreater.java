package Stack;

import java.util.Scanner;
import java.util.Stack;

public class PreviousGreater {
    public static int[] previous(int[]arr){
        int n= arr.length;
        int []res= new int[n];
        Stack<Integer>st = new Stack<>();
//        st.push(arr[0]);
        for (int i = 0; i <n; i++) {
            while(!(st.isEmpty())&&arr[i]>st.peek()){
                st.pop();
            }
            if (st.isEmpty()) res[i]=-1;
            else res[i]=st.peek();
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
        int []ans =previous(arr);
        for (int i = 0; i <ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
