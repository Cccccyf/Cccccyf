package leetcode;
//leetcode_215数组中的第K个最大元素
//利用partition函数
//傻逼
//我也是快速排序思想为什么时间复杂度差这么多啊
//最优解是
public class question_215 {
    public static int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        int target = len-k;
        int left = 0;
        int right = len-1;
        while(true)
        {
            int index = partition(nums,left,right);
            if(index == target){
                return nums[index];
            }else if(index>target){
                right = index-1;
            }else{
                left = index+1;
            }
        }
    }
    public static int partition(int[] nums,int lo,int hi){
        int left = lo;
        int right = hi+1;
        while(true)
        {
            while(left<right&&nums[--right]>=nums[lo])
            {
                if(right==lo){
                    break;
                }
            }
            while(left<right&&nums[++left]<nums[lo])
            {
                if(left==hi){
                    break;
                }
            }
            if(left<right){
                int fuck = nums[left];
                nums[left] = nums[right];
                nums[right] = fuck;
            }
            if(left>=right) break;
        }
        System.out.println(lo+":"+nums[lo]+"<->"+right+":"+nums[right]);
        int temp = nums[right];
        nums[right] = nums[lo];
        nums[lo] = temp;
        return right;
    }

}
