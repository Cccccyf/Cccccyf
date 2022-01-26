package leetcode;
/*leetcode_153寻找旋转排序数组中的最小值*/
public class question_153 {
    public int findMin(int[] nums) {
        int length = nums.length;
        int left = 0;
        int right = length-1;
        if(nums.length==1) return nums[0];
        if(nums[0]<nums[length-1]) return nums[0];
        while(left!=right){
            int mid = left+(right-left)/2;
            if(nums[mid]>=nums[0]){
                left = mid+1;
            }else if(nums[mid]<nums[0]){
                right = mid;
            }
        }
        return nums[left];
    }
}
3 4 5 1 2
1 2 4 5 6
11 13 15 17