package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {
    static boolean isBalanced(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <str.length() ; i++) {
            char br = str.charAt(i);
            if (br=='('){
                stack.push(br);
            }
            else{
                if (stack.isEmpty()) return false;//if stack is empty here no need for further operation its unbalanced
                else if (stack.peek()=='(') {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your bracket sequence");
        String seq = scanner.nextLine();
        System.out.println("stack is balanced::"+ isBalanced(seq));
    }
}
