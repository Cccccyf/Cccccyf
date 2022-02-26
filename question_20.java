package leetcode;

import java.util.Stack;

//leetcode_20有效的括 号
public class question_20 {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == '('){
                brackets.push(')');
            }else if(ch == '['){
            brackets.push(']');
            }else if(ch == '{'){
                brackets.push('}');
            }else if(brackets.empty()||brackets.peek()!=ch){
                return false;
            }else{
                brackets.pop();
            }
        }
        return brackets.empty();
    }
}
