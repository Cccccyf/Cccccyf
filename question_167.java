package leetcode;
//leetcode_167两数之和II-输入有序数组
public class question_167 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int[] res = new int[2];
        while(i<j)
        {
            if(numbers[i] + numbers[j] == target){
                res[0] = i;
                res[1] = j;
                return res;
            }else if(numbers[i] + numbers[j] < target){
                i++;
            }else if(numbers[i] + numbers[j] > target){
                j--;
            }
        }
        return res;
    }
}
