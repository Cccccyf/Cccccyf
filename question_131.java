package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//leetcode_131切割回文串
//时间复杂度有点看不过去……，不管了！打csgo
public class question_131 {
    List<List<String>> res = new ArrayList<>();
    LinkedList<String> small = new LinkedList<>();
    public List<List<String>> partition(String s) {
        char[] ss = s.toCharArray();
        dfs(ss,0);
        return res;
    }
    public void dfs(char[] ss,int start){
        if(start > ss.length-1){
            res.add(new ArrayList<>(small));
            return;
        }
        for(int length =1;length<=ss.length-start;length++)
        {
            if(whether(ss,start,start+length-1)){
                StringBuilder new_string = new StringBuilder();
                for(int i = start;i<=start+length-1;i++)
                {
                    new_string.append(ss[i]);
                }
                System.out.println(new_string);
                small.add(new_string.toString());
            }else{
                continue;
            }
            dfs(ss,start+length);
            small.removeLast();
        }
    }
    public boolean whether(char[] ss,int start,int end){
        int j = end;
        int i = start;
        while(j>=i)
        {
            if(ss[j]!=ss[i]) return false;
            j--;
            i++;
        }
        return true;
    }
}
