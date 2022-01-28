package leetcode;

import java.util.Stack;

/*leetcode_844比较含推格的字符串*/
//利用栈
public class question_844 {
    public boolean backspaceCompare(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for(char sss:ss){
            if(sss == '#'){
                if(!stack1.empty()) stack1.pop();
            }else{
                stack1.push(sss);
            }
        }
        for(char ttt:tt){
            if(ttt == '#'){
                if(!stack2.empty()) stack2.pop();
            }else{
                stack2.push(ttt);
            }
        }
        if(!stack1.empty()&&stack2.empty()){
            return false;
        }
        if(stack1.empty()&&!stack2.empty()){
            return false;
        }
        while(!stack1.empty()&&!stack2.empty()){
            if(stack1.pop()!=stack2.pop()){
                return false;
            }
            if(stack1.empty()&&!stack2.empty()){
                return false;
            }
            if(!stack1.empty()&&stack2.empty()){
                return false;
            }
        }
        return true;
    }
}
