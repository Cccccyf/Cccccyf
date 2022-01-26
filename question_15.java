package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*leetcode_15三数之和*/
//傻逼人做傻逼题得傻逼超时
public class question_15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if(length<=2) return res;
        Arrays.sort(nums);
        int i = 0;
        while(nums[i]<=0&&i<length-2){
            if(i!=0&&nums[i]==nums[i-1]){
                while(i<length-2){
                    if(nums[i]!=nums[i-1]){
                        break;
                    }
                    i++;
                }
            }
            int j = i+1;
            int k = length-1;
            while(j<k)
            {
                if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                }else if(nums[i]+nums[j]+nums[k]>0){
                    k--;
                }else if(nums[i]+nums[j]+nums[k]==0){
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], nums[k])));
                    while(j<k&&nums[j]==nums[j+1]){
                        j++;
                    }
                    while(j<k&&nums[k]==nums[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                }

            }
            i++;
        }
        return res;
    }
}
