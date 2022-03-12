package leetcode;

import java.util.LinkedList;
import java.util.Stack;

//leetcode_394字符串解码
//我是傻逼
//有点不太会，明天接着想
public class question_394 {
    public  static String decodeString(String s){
        StringBuilder res = new StringBuilder();
        int multi = 0;
        Stack<Integer> int_stack = new Stack<>();
        Stack<String> string_stack = new Stack<>();
        StringBuilder temp;
        for(char ss:s.toCharArray())
        {
            if(ss == '['){
                int_stack.push(multi);
                string_stack.push(res.toString());
                multi = 0;
                res = new StringBuilder();
            }else if(ss == ']'){
                temp = new StringBuilder();
                int _multi = int_stack.pop();
                for(int i = 0;i<_multi;i++)
                {
                    temp.append(res);
                }
                res = new StringBuilder(string_stack.pop() + temp);
            }else if(ss>='0'&&ss<='9'){
                multi = 10 * multi + Integer.parseInt(ss+"");
            }else{
                res.append(ss);
            }
        }
        return res.toString();
    }
//    public String decodeString(String s) {
//        StringBuilder res = new StringBuilder();
//        int multi = 0;
//        LinkedList<Integer> stack_multi = new LinkedList<>(); //存储倍数
//        LinkedList<String> stack_res = new LinkedList<>();  //存储字符串
//        for(Character c : s.toCharArray()) {
//            if(c == '[') {
//                stack_multi.addLast(multi);
//                stack_res.addLast(res.toString());
//                multi = 0;
//                res = new StringBuilder();
//            }
//            else if(c == ']') {
//                StringBuilder tmp = new StringBuilder();
//                int cur_multi = stack_multi.removeLast();
//                for(int i = 0; i < cur_multi; i++) tmp.append(res);
//                res = new StringBuilder(stack_res.removeLast() + tmp);
//            }
//            else if(c >= '0' && c <= '9') multi = multi * 10 + Integer.parseInt(c + "");
//            else res.append(c);
//        }
//        return res.toString();
//    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        String ss = "3[a2[c]]";
        System.out.println(decodeString(ss));
    }
}
