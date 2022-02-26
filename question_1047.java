package leetcode;

import java.util.Stack;

//leetcode_1047删除字符串中的所有相邻重复项
public class question_1047 {
    public String removeDuplicates(String s) {
        Stack<Character> alp = new Stack<>();
        StringBuilder res = new StringBuilder();
        char ch;
        for(int i = 0;i<s.length();i++)
        {
            ch = s.charAt(i);
            if(alp.empty()||alp.peek()!=ch){
                alp.push(ch);
            }else{
                alp.pop();
            }
        }
        while(!alp.empty()){
            res.append(alp.pop());
        }
        res.reverse();
        return res.toString();
    }
}
