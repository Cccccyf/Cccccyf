package leetcode;

import java.util.ArrayList;
import java.util.List;
//此种解答时间复杂度并不友好，看看题解，学学人家怎么写的
/*leetcode_986区间列表的交集*/
public class question_986 {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int len_1 = firstList.length;
        int len_2 = secondList.length;
        if(len_1==0||len_2==0) return new int[0][0];
        List<int[]> res = new ArrayList<>();
        for (int[] value : firstList) {
            int start_i = value[0];
            int end_i = value[1];
            for (int[] ints : secondList) {
                int start_j = ints[0];
                int end_j = ints[1];//[3,5] [1,2]
                if(((start_j<=end_i)&&(end_j>=start_i))||((start_i<=end_j)&&(end_i>=start_j))){
                    int[] k= new int[2];
                    k[0] = return_max(start_i, start_j);
                    k[1] = return_min(end_i, end_j);
                    res.add(k);
                }
            }
        }
        if(res.isEmpty()) return new int[0][0];
        return  res.toArray(new int[res.size()][]);
    }

    public int return_max(int i,int j){
        if(i>=j){
            return i;
        }else{
            return j;
        }
    }

    public int return_min(int i,int j){
        if(i<=j){
            return i;
        }else{
            return j;
        }
    }
}
