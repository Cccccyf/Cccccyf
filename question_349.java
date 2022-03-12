package leetcode;

import java.util.HashSet;
import java.util.Set;

//leetcode_349两个数组的交集
public class question_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length == 0||nums2.length == 0) return new int[0];
        Set<Integer> set = new HashSet<>();
        Set<Integer> repeat = new HashSet<>();
        for(int num1:nums1)
        {
            set.add(num1);
        }
        for(int num2:nums2)
        {
            if(set.contains(num2)){
                repeat.add(num2);
            }
        }
        int[] res = new int[repeat.size()];
        int index = 0;
        for(int i:repeat)
        {
            res[index++] = i;
        }
        return res;
    }
}
