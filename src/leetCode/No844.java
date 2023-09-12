package leetCode;

import java.util.Stack;

public class No844 {
    public static void main(String[] args) {
        String s = "ab##";//""
        String t = "c#d#";//""
        Solution844 solution844 = new Solution844();
        System.out.println(solution844.backspaceCompare(s,t));
    }
}
class Solution844 {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for(char c:s.toCharArray()){
            if(c=='#'){
                if(!stack1.isEmpty())
                    stack1.pop();
            }
            else{
                stack1.push(c);
            }
        }
        for(char c:t.toCharArray()){
            if(c=='#'){
                if(!stack2.isEmpty())
                    stack2.pop();
            }
            else{
                stack2.push(c);
            }
        }
        if(stack1.equals(stack2)){
            return true;
        }

        return false;

//        String resultS =new String();
//        String resultT =new String();
//
//        for(char c:s.toCharArray()){
//            stack1.push(c);
//        }
//        for(char c:t.toCharArray()){
//            stack2.push(c);
//        }
//
//        for(int i=0; i<s.length(); i++){
//            char ch = stack1.pop();
//            if(ch=='#'){
//
//            }
//        }
//        for(int i=0; i<t.length(); i++){
//            if(!stack2.peek().equals('#')){
//                resultT += stack2.pop();
//            }
//            else{
//                stack2.pop();
//                i++;
//            }
//        }
//
//        return resultT.equals(resultS);
    }
}
