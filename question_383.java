package leetcode;

import java.util.HashMap;
import java.util.Map;

//leetcode_383赎金信
//使用map时间复杂度太高建议使用数组
//我是臭傻逼
public class question_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean whether = true;
        Map<Character,Integer> map = new HashMap<>();
        char[] letter = ransomNote.toCharArray();
        char[] mega = magazine.toCharArray();
        for(char i: mega)
        {
            if(!map.containsKey(i)){
                map.put(i,1);
            }else{
                map.put(i,map.get(i)+1);
            }
        }
        for(char i:letter)
        {
            if(!map.containsKey(i)||map.get(i)<=0){
                whether = false;
                break;
            }else{
                map.put(i,map.get(i)-1);
            }
        }
        return whether;
    }
    public boolean canConstruct_another(String ransomNote, String magazine) {
        //记录杂志字符串出现的次数
        int[] arr = new int[26];
        int temp;
        for (int i = 0; i < magazine.length(); i++) {
            temp = magazine.charAt(i) - 'a';
            arr[temp]++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            temp = ransomNote.charAt(i) - 'a';
            //对于金信中的每一个字符都在数组中查找
            //找到相应位减一，否则找不到返回false
            if (arr[temp] > 0) {
                arr[temp]--;
            } else {
                return false;
            }
        }
        return true;
    }
}
