package leetcode;

import java.util.Objects;
import java.util.Stack;

//leetcode_150逆波兰表达式求解
//明白了老子
public class question_150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<>();
        String ch;
        int a ,b;
        for (String token : tokens) {
            ch = token;
            if (!Objects.equals(ch, "+") && !Objects.equals(ch, "-") && !Objects.equals(ch, "*") && !Objects.equals(ch, "/")) {
                Integer num = new Integer(ch);
                nums.push(num);
            } else {
                b = nums.pop();
                a = nums.pop();
                nums.push(calculate(ch, a, b));
            }
        }
        return nums.pop();
    }
    public int calculate(String cal,int a,int b){
        if(Objects.equals(cal, "+")){
            return a + b;
        }else if(Objects.equals(cal, "-")){
            return a - b;
        }else if(Objects.equals(cal, "/")){
            return a / b;
        }else{
            return a * b;
        }
    }
}
