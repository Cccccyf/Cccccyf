package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//leetcode_78子集问题
public class question_78 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> small = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        int length = nums.length;
        for(int i = 1;i<=length;i++)
        {
            dfs(nums,i,1,0);
        }
        res.add(new ArrayList<>());
        return res;
    }
    public void dfs(int[] nums,int length,int num,int index){
        if(num>length){
            res.add(new ArrayList<>(small));
            System.out.println(small);
            return;
        }
        for(int i = index;i<=nums.length-length+num-1;i++)
        {
            small.add(nums[i]);
            dfs(nums,length,num+1,i+1);
            small.removeLast();
        }
    }
}
