//Longest Valid Parenthesis
//Find the length of the Longest substing of valid parentheses
import java.util.*;
public class LC_32{
    public static void main(String[] args){
        System.out.println(longestValidParenthesis(")()())"));
    }

    public static int longestValidParenthesis(String s){
        Stack<Integer> st = new Stack<>();
        int max = 0;
        st.push(-1);

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                    continue;
                }  
                max = Math.max(max, i-st.peek());
            }
        }
        return max;
    }
    
}