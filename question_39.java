package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//leetcode_39组合总和
//小case
public class question_39 {
    static List<List<Integer>> res = new ArrayList<>();
    static LinkedList<Integer> small = new LinkedList<>();
    static int sum = 0;
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates,target,0);
        return res;
    }
    public static void dfs(int[] candidiates,int target,int index){
        if(sum == target){
            res.add(new ArrayList<>(small));
            return;
        }
        for(int i = index;i<candidiates.length;i++)
        {
            small.add(candidiates[i]);
            sum += candidiates[i];
            if(sum>target){
                sum -= candidiates[i];
                small.removeLast();
                break;
            }
            dfs(candidiates,target,index);
            sum -= candidiates[i];
            small.removeLast();
            index++;
        }
    }

    public static void main(String[] args) {
        int[] candidates = new int[6];
        candidates[0]=2;
        candidates[1]=7;
        candidates[2]=6;
        candidates[3]=3;
        candidates[4]=5;
        candidates[5]=1;
        int target = 9;
        System.out.println(combinationSum(candidates,target));
    }
}
//[2,7,6,3,5,1]
//9