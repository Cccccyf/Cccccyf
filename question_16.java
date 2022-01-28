package leetcode;

import java.util.Arrays;

//leetcode_16最接近的三数之和
public class question_16 {
    public int threeSumClosest(int[] nums,int target){
        Arrays.sort(nums);
        int sum = nums[0]+nums[1]+nums[2];
        int length = nums.length;
        int abs = Math.abs(nums[0]+nums[1]+nums[2]-target);
        for(int i = 0;i<length-2;i++)
        {
            if(abs==0) break;
            int j = i+1;
            int k = length-1;
            while(j<k){
                if(Math.abs(nums[i]+nums[j]+nums[k]-target)<abs){
                    abs = Math.abs(nums[i]+nums[j]+nums[k]-target);
                    sum = nums[i]+nums[j]+nums[k];
                }
                if(nums[i]+nums[j]+nums[k]-target<0){
                        j++;
                }else{
                        k--;
                }
            }
        }
        return sum;
    }
}
