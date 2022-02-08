package leetcode;
import java.util.Scanner;

//leetcode_209长度最小的子数组
public class question_209 {
    public static int minSubArrayLen(int target, int[] nums) {
       int start = 0;
       int end = 0;
       int sum = nums[start];
       int size = 1;
       int ans = 0;
       if (nums.length==0) return 0;
       while(!(sum<target&&end==nums.length-1)){
           if(sum<target){
               end++;
               sum += nums[end];
               size++;
           }else{
               if(start == 0) ans = size;
               if(ans > size) ans = size;
               sum -= nums[start];
               start++;
               size--;
           }
       }
       return ans;
    }

    public static void main(String[] args) {
        int[] test = new int[12];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i<12;i++)
        {
            test[i] = scanner.nextInt();
        }
        System.out.println(minSubArrayLen(213,test));
    }
}

//12 28 83 4 25 26 25 2 25 25 25 12