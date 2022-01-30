package leetcode;
//leetcode_27移除元素
public class question_27 {// [1 1]
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length-1;
        if(nums.length==1&&nums[0]==val) return 0;
        while(left<right)
        {
            while(left<right&&nums[right]==val)
            {
                right--;
            }
            while(left<right&&nums[left]!=val)
            {
                left++;
            }
            if(left<right) {
                swap(nums, right, left);
            }
        }
        if(right==0&&nums[0]==val) return 0;
        return right+1;
    }
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
