package leetcode;
//leetcode_88合并两个有序数组
public class question_88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i>=0||j>=0)
        {
            if(i<0&&j>=0){
                nums1[k] = nums2[j];
                j--;
                k--;
            }else if(j<0&&i>=0){
                nums1[k] = nums1[i];
                i--;
                k--;
            }else if(nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }else if(nums2[j]>=nums1[i]){
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
    }
}
