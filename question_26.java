package leetcode;
//leetcode_26删除有序数组中的重复项
//解法参考自question_80删除有序数组中的重复项II
//woshishabi
public class question_26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1) return nums.length;
        int i = 0;
        for(int n: nums)
        {
            if(i<1||nums[i-1]!=n){
                nums[i] = n;
                i++;
            }
        }
        return i;
    }
}
