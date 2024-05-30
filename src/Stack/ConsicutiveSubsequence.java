package Stack;

import java.util.Stack;

public class ConsicutiveSubsequence {
    public static int[] remove(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (st.isEmpty() || arr[i] != st.peek()) {
                st.push(arr[i]);
            }else if(arr[i]==st.peek())  {//skip if the element of array[i+1] equal to the peek of the stack
                if (i == arr.length - 1 || arr[i] != arr[i + 1]) {//take action on
                    st.pop();
                }
            }
        }
        int[] res = new int[st.size()];
        int a = res.length-1;
        for (int i = a; i >=0; i--) {
            res[i]=st.pop();
        }
        return res;
}
    public static void main(String[] args) {
        int[] arr= {1,2,2,3,3,10,10,10,4,4,5,7,7,2};
        int[] ans = remove(arr);
        for (int i = 0; i <ans.length ; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
