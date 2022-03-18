package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//leetcode_93复原IP地址
public class question_93 {
    List<String> res = new ArrayList<>();
    StringBuilder part = new StringBuilder();
    public List<String> restoreIpAddresses(String s) {
        dfs(s,1,0);
        return res;
    }
    public void dfs(String s,int index,int start){
        if(index>4){
            return;
        }
        for(int length =1;length<=3&&start+length<=s.length();length++){
            if(length!=1&&s.charAt(start) == '0'){
                return;
            }
            System.out.println("第"+index+"个地址");
            String new_string = s.substring(start,start+length);
            System.out.println(new_string);
            int value = Integer.parseInt(new_string);
            if(value<=255&&value>=0){
                part.append(new_string);
                if(index ==4&&start+length == s.length()){
                    System.out.println("fuckkjksjd");
                    System.out.println(part.toString());
                    res.add(part.toString());
                    index--;
                    part.delete(part.length()-length,part.length());
                    break;
                }else{
                    part.append(".");
                }
            }else if(value>255){
                break;
            }
            dfs(s,++index,start+length);
            index--;
            part.delete(part.length()-length-1, part.length());
        }
    }
}
//