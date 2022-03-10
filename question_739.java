package leetcode;

import java.text.DecimalFormat;
import java.util.Deque;
import java.util.LinkedList;
//我是傻逼
//leetcode_739每日温度
public class question_739 {
    public static int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        Deque<Integer> stack = new LinkedList<>();
        int[] res = new int[length];
        for(int i = 0;i<length;i++)
        {
            int temper = temperatures[i];
            while(!stack.isEmpty()&&temper>temperatures[stack.peek()])
            {
                int preIndex = stack.pop();
                res[preIndex] = i - preIndex;
            }
            stack.push(i);
        }
        return res;
    }
}
