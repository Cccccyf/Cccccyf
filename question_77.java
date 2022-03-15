package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//leetcode_77组合
//没有自己写出来
public class question_77 {
    LinkedList<Integer> small = new LinkedList<>();
    List<List <Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        dfs(1,n,k);
        return res;
    }
    public void dfs(int index,int n,int k){
        //index:数字   k:数量 n:最大
        if(small.size() == k){
            res.add(new ArrayList<>(small));
            return;
        }
        for(int i = index;i<=n - (k-small.size())+1;i++) {
            small.add(i);
            dfs(i+1,n,k);
            small.removeLast();
        }
    }
}
