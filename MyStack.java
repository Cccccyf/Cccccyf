package leetcode;

import java.util.LinkedList;
import java.util.Queue;

//leetcode_225用队列实现栈
public class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        int size2 = queue2.size();
        queue1.offer(x);
        queue2.offer(queue1.poll());
        if(queue2.size()!=1){
            for(int i =0;i<size2;i++)
            {
                queue2.offer(queue2.poll());
            }
        }
    }

    public int pop() {
        return queue2.poll();
    }

    public int top() {
        return queue2.peek();
    }

    public boolean empty() {
        if(queue2.isEmpty()) return true;
        return false;
    }
}
