package leetcode;

import java.util.Map;

//leetcode_242有效的字母异位词
public class question_242 {
    public boolean isAnagram(String s, String t) {
        int[] alp_nums = new int[26];
        for(char ss:s.toCharArray())
        {
            alp_nums[ss-'a']++;
        }
        for(char tt:t.toCharArray())
        {
            alp_nums[tt-'a']--;
        }
        for(int num:alp_nums)
        {
            if(num!=0) return false;
        }
        return true;
    }
}
