package leetcode;
//leetcode_18四数之和
//我他妈的必靠自己写出这题
//妈的时间复杂度跟空间复杂度都不咋地
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class question_18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length<4) return new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0;i<nums.length-3;i++)
        {
            if(i!=0&&nums[i]==nums[i-1]) continue;
            for(int j = i+1;j<nums.length-2;j++)
            {
                if(j!=i+1&&nums[j]==nums[j-1]) continue;
                int k = j+1;
                int l = nums.length-1;
                while(k<l)
                {
                    if(nums[i]+nums[j]+nums[k]+nums[l] == target){
                        result.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k],nums[l])));
                        while(k<l)
                        {
                            l--;
                            if(nums[l]<nums[l+1]) break;
                        }
                        while(k<l)
                        {
                            k++;
                            if(nums[k]>nums[k-1]) break;
                        }
                    }else if(nums[i]+nums[j]+nums[k]+nums[l] > target){
                        while(k<l)
                        {
                            l--;
                            if(nums[l]<nums[l+1]) break;
                        }
                    }else{
                        while(k<l)
                        {
                            k++;
                            if(nums[k]>nums[k-1]) break;
                        }
                    }
                }
            }
        }
        return result;
    }
}
