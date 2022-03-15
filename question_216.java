package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//leetcode_216组合总和III
//牛逼
public class question_216 {
    static List<List<Integer>> res = new ArrayList<>();
    static LinkedList<Integer> small = new LinkedList<>();
    static int sum = 0;
    public static List<List<Integer>> combinationSum3(int k, int n) {
        dfs(n,k,1);
        return res;
    }
    public static void dfs(int target,int k,int index){
        if(small.size() == k){
            if(sum == target){
                res.add(new ArrayList<>(small));
                return;
            }else {
                return;
            }
        }
        for(int i = index;i<=9;i++){
            small.add(i);
            sum = sum + i;
            dfs(target,k,i+1);
            if(sum>target) {
                sum = sum - i;
                small.removeLast();
                break;
            }
            sum = sum - i;
            small.removeLast();
        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum3(2,18));
    }
}
