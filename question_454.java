package leetcode;

import java.util.HashMap;
import java.util.Map;

//leetcode_454四数相加II
public class question_454 {
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        Map<Integer,Integer> AnB = new HashMap<>();
        for(int num:nums1)
        {
            for(int num_:nums2)
            {
                if(!AnB.containsKey(num_+num)) {
                    AnB.put(num_ + num, 1);
                }else{
                    AnB.put(num_+num,AnB.get(num_+num)+1);
                }
            }
        }
        for(int num:nums3)
        {
            for(int num_:nums4)
            {
                if(AnB.containsKey(-(num+num_))&&AnB.get(-(num+num_))>0){
                    count+=AnB.get(-(num+num_));
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[2];
        nums1[0] = -1;
        nums1[1] = 1;
        int[] nums2 = nums1;
        int[] nums3 = nums1;
        int[] nums4 = nums1;
        System.out.println(fourSumCount(nums1,nums2,nums3,nums4));
    }
}
//[-1,-1]
//[-1,1]
//[-1,1]
//[1,-1]