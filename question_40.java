package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//leetcode_组合总和II
//牛逼
public class question_40 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> small = new LinkedList<>();
    int sum = 0;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates,0,target);
        return res;
    }
    public void dfs(int[] candidates,int index,int target){
        if(sum == target){
            res.add(new ArrayList<>(small));
            return;
        }
        for(int i = index;i<candidates.length;i++)
        {
            while(i!=index&&i<=candidates.length-1&&candidates[i-1]==candidates[i]){
                i++;
            }
            if(i==candidates.length) break;
            small.add(candidates[i]);
            sum += candidates[i];
            if(sum > target){
                sum -= candidates[i];
                small.removeLast();
                break;
            }
            dfs(candidates,i+1,target);
            sum -= candidates[i];
            small.removeLast();
        }
    }
}
