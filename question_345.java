package leetcode;

import java.util.Arrays;

//leetcode_345反转字符串中的元音字母
public class question_345 {
    public String reverseVowels(String s) {
        char[] ss = s.toCharArray();
        int i = 0;
        int j= ss.length - 1;
        char temp;
        while(i<j){
            if((ss[i]=='A'||ss[i]=='a'||ss[i]=='E'||ss[i]=='e'||ss[i]=='I'||ss[i]=='i'||
                    ss[i]=='O'||ss[i]=='o'||ss[i]=='U'||ss[i]=='u')&&
                    (ss[j]=='A'||ss[j]=='a'||ss[j]=='E'||ss[j]=='e'||ss[j]=='I'||ss[j]=='i'||
                    ss[j]=='O'||ss[j]=='o'||ss[j]=='U'||ss[j]=='u')){
                temp = ss[i];
                ss[i] = ss[j];
                ss[j] = temp;
                i++;
                j--;
            }else{
                while((i<j)&&!(ss[i]=='A'||ss[i]=='a'||ss[i]=='E'||ss[i]=='e'||ss[i]=='I'||ss[i]=='i'||
                        ss[i]=='O'||ss[i]=='o'||ss[i]=='U'||ss[i]=='u'))
                {
                    i++;
                }
                while(i<j&&!(ss[j]=='A'||ss[j]=='a'||ss[j]=='E'||ss[j]=='e'||ss[j]=='I'||ss[j]=='i'||
                        ss[j]=='O'||ss[j]=='o'||ss[j]=='U'||ss[j]=='u'))
                {
                    j--;
                }
            }
        }
        return(new String(ss));
    }
}
