import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == ')'){
                if (stack.empty()){
                    return false;
                }
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        
        return stack.empty();
    }
}