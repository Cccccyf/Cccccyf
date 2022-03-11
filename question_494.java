package leetcode;
//leetcode_494目标和
public class question_494 {
    private int num = 0;
    private int index = -1;
    public int findTargetSumWays(int[] nums, int target) {
        dfs(nums,target,0);
        return num;
    }
    public void dfs(int[] nums,int target,int sum){
        index++;
        int i = index;
        //System.out.println(i);
        if(i == nums.length-1){
            if(nums[i] + sum == target){
                num++;
            }
            if(sum - nums[i] == target){
                num++;
            }
            return;
        }
        dfs(nums,target,sum - nums[i]);
        index--;
        dfs(nums,target,sum + nums[i]);
        index--;
    }
}
