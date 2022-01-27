package leetcode;
//leetcode_11盛水最多的容器
//水量等于两数在数组中的索引之差与较小数的乘积
//我要疯了shit
//双指针方法
public class question_11{
    public int maxArea(int[] height){
        int length = height.length;
        int left = 0;
        int right = length-1;
        int max = 0;
        while(left<right)
        {
            if(max<(right-left)*Math.min(height[left],height[right])){
                max = (right-left)*Math.min(height[left],height[right]);
            }
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}