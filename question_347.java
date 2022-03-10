package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

//leetcode_347前K个高频元素
//优先队列——大顶堆
//说实话有点不太会
public class question_347 {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Set<Map.Entry<Integer,Integer>> entries = map.entrySet();
        PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>(((o1, o2) -> o1.getValue()-o2.getValue()));
        for (Map.Entry<Integer, Integer> entry : entries) {
            queue.offer(entry);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        for (int i = k - 1; i >= 0; i--) {
            result[i] = queue.poll().getKey();
        }
        return result;
    }
}
