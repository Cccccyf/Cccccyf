package leetcode;
/*leetcode_33搜索旋转排序数组*/
public class question_33 {
    public int search(int[] nums, int target) {
        int right = nums.length-1;
        int left = 0;
        if(right == -1) return -1;
        if(right==0&&target!=nums[0]) return -1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>=nums[0]){
                if(nums[mid]>target&&target>=nums[0]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else{
                if(nums[mid]<target&&target<=nums[nums.length-1]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}

