package leetcode;

import java.util.*;

//leetcode_17电话号码的字母组合
public class question_17 {
    List<String> res = new ArrayList<>();
    LinkedList<Character> small = new LinkedList<>();
    Map<Character,String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        int length = digits.length();
        if (digits == null || length == 0) {
            return res;
        }
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        char[] dd = digits.toCharArray();
        dfs(1,length,dd);
        return  res;
    }
    public void dfs(int index,int length,char[] dd){
        if(small.size() == length ){
            StringBuilder ss = new StringBuilder();
            for(char c:small)
            {
                ss.append(c);
            }
            res.add(ss.toString());
            return;
        }
        char alp = dd[index];
        for(int i = 0;i<map.get(alp).length();i++)
        {
            small.add(map.get(alp).charAt(i));
            dfs(index+1,length,dd);
            small.removeLast();
        }
    }
}
