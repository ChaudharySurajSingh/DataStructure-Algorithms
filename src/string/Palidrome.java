package string;

public class Palidrome {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("madam");
        int i = 0,j=str.length()-1;
        boolean flag = true;
        while(i<j){
            if (str.charAt(i)!=str.charAt(j)) {
                flag = false;
                break;
            }
            i++;j--;
            }
        System.out.println(flag);
        }
}
