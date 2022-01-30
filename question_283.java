package leetcode;
//leetcode_283移动零
public class question_283 {
    public void moveZeroes(int[] nums) {
//        if(nums.length == 1) return;
//        int i = 0;
//        int j = i;
//        while(i<nums.length&&j<nums.length)
//        {
//            while(i< nums.length&&nums[i]!=0){
//                i++;
//            }
//            if(i<nums.length) {
//                while (j <= i || (nums[j] == 0&&j<nums.length)) {
//                    j++;
//                }
//                if (j < nums.length && nums[j] != 0) {
//                    swap(nums, i, j);
//                }
//                j++;
//            }
//        }
        int slow = 0;
        for(int fast = 0;fast<nums.length;fast++)
        {
            if(nums[fast]!=0){
                swap(nums,slow,fast);
                slow++;
            }
        }
    }
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
