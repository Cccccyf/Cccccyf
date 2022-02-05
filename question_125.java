package leetcode;
//leetcode_125验证回文串
//空间复杂度
public class question_125 {
    public boolean isPalindrome(String s) {
        char[] ss = s.toCharArray();
        int i = 0;
        int j = ss.length - 1;
        while(i<=j)
        {
            if(((ss[i]>='A'&&ss[i]<='Z')||(ss[i]>='a'&&ss[i]<='z')||(ss[i]>='0'&&ss[i]<='9'))
                    &&((ss[j]>='A'&&ss[j]<='Z')||(ss[j]>='a'&&ss[j]<='z')||(ss[j]>='0'&&ss[j]<='9'))) {
                if(ss[i]>=97&&ss[i]<=122) ss[i] -= 32;
                if(ss[j]>=97&&ss[j]<=122) ss[j] -= 32;
                if (ss[i] == ss[j]) {
                    i++;
                    j--;
                } else {
                    return false;
                }
            }else{
                while((i<=j)&&(!((ss[i]>='A'&&ss[i]<='Z')||(ss[i]>='a'&&ss[i]<='z')||(ss[i]>='0'&&ss[i]<='9'))))
                {
                    i++;
                }
                while((i<=j)&&!((ss[j]>='A'&&ss[j]<='Z')||(ss[j]>='a'&&ss[j]<='z')||(ss[j]>='0'&&ss[j]<='9')))
                {
                    j--;
                }
            }
        }
        return true;
    }
}
