package leetcode;

import java.util.Stack;

//leetcode_232用栈实现队列
//傻逼
public class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
       stack1.push(x);
        if(!stack1.empty()&& stack2.empty()){
            while(!stack1.empty())
            {
                stack2.push(stack1.pop());
            }
        }
    }

    public int pop() {
        if(stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if(stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        if(stack1.empty()&&stack2.empty()) return  true;
        return false;
    }
}
