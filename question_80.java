package leetcode;
//leetcode_80删除有序数组中的重复项II
//fuck明天写
//真的没写出来这道淦
public class question_80 {
    public int removeDuplicates(int[] nums){
        if(nums.length <=2) return nums.length;
        int j = 0;
        for(int n:nums)
        {
            if(j<2||nums[j-2]!=n) {
                nums[j] = n;
                j++;
            }
        }
        return j;
    }
}
