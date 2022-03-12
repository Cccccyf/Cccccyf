package leetcode;

import java.util.HashSet;
import java.util.Set;

//leetcode_202快乐数
//之前的代码不够聪明
//我是臭傻逼
public class question_202 {
    private Set<Integer> set = new HashSet<>();
    public boolean isHappy(int n) {
        int sum = n;
        while(sum!=1&&!set.contains(sum))
        {
            set.add(sum);
            sum = getSum(sum);

        }
        return sum==1;
    }

    public int getSum(int n){
        int sum = 0;
        while(n>0)
        {
            int temp = n % 10;
            sum += temp*temp;
            n = n / 10;
        }
        return sum;
    }


    public static void main(String[] args) {
        int n =345666;
        String nn = String.valueOf(n);
        int length = nn.length();
        System.out.println(nn+" "+length);
    }
}
