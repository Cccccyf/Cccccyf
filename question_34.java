package leetcode;
/*leetcode_34在排序数组中查找元素的第一个和最后一个位置*/
/*public class question_34 {
    public static int[] searchRange(int[] nums, int target) {
        int[] index = new int[2];
        int num = 0;
        int start =-1;
        int end = -1;
        boolean exist = false;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target&&exist == false){
                exist = true;
                start = i;
                num++;
                continue;
            }
            if(nums[i]==target) num++;

        }
        if(exist == true){
            end = start + num -1;
        }
        if(exist = false) {
            index[0] = -1;
            index[1] = -1;
        }
        index[0] = start;
        index[1] = end;
        return index;
    }
    public static void main(String[] args){
        int[] a = new int[1];
        a[0]=1;
        System.out.println(searchRange(a,1)[0]);
        System.out.println(searchRange(a,1)[1]);
    }
}*/
//二分查找思想
public class question_34 {
    public static int[] searchRange(int[] nums, int target) {
        int right_border = search_right_border(target,nums);
        int left_border = search_left_border(target,nums);
        if (left_border == -2 || right_border == -2) return new int[]{-1, -1};
        if (right_border - left_border > 1) return new int[]{left_border + 1, right_border - 1};
        return new int[]{-1, -1};
    }
    public static int search_right_border(int target, int[] nums){
        int left = 0;
        int right = nums.length-1;
        int right_border = -2;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]>target){
                right = mid -1;
            }else {
                left = mid+1;
                right_border = left;
            }
        }
        return right_border;
    }
    public static int search_left_border(int target, int[] nums){
        int right = nums.length-1;
        int left = 0;
        int left_border = -2;
        while(left<=right)
        {
            int mid = left + (right-left)/2;
            if(nums[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
                left_border = right;
            }
        }
        return left_border;
    }
}