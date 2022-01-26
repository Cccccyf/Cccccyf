package leetcode;
/*leetcode_162寻找峰值*/
public class question_162 {
    public int findPeakElement(int[] nums) {
        int length = nums.length;
        if(length == 1) return 0;
        int left = 0;
        int right = length-1;
        while(left!=right)
        {
            int mid = left+(right-left)/2;
            if(mid == 0&&nums[mid]>nums[mid+1]) return mid;
            if(mid == length-1&&nums[mid]>nums[mid-1]) return mid;
            if(nums[mid]<nums[mid+1]){//代表在mid处单调递增
                left = mid+1;
            }else{//mid处单调递减
                right = mid;
            }
        }
        return left;
    }
}