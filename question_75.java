package leetcode;
//leetcode_75颜色分类
//双指针
//草泥马
public class question_75 {
    public void sortColors(int[] nums) {
        int small_edge = 0;
        int big_edge = nums.length-1;
        int i = 0;
        while(i<=big_edge)
        {
            if(nums[i]<1){
                swap(nums,small_edge,i);
                small_edge++;
                i++;
            }else if(nums[i]>1){
                swap(nums,big_edge,i);
                i++;
                big_edge--;
                i--;
            }else{
                i++;
            }
        }
    }
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
