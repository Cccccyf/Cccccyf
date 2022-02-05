package leetcode;
//leetcode_215堆排序解法
public class question_215_heap{
    //3 2 1 5 6 4
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        int heapSize = nums.length;
        buildMaxHeap(nums,len);
        for(int i = len-1;i>=len-k+1;i--)
        {
            swap(nums,0,i);
            heapSize--;
            maxHeapify(nums,0,heapSize);
        }
        return nums[0];
    }

    public void buildMaxHeap(int[] a, int heapSize) {//构建大根堆
        for(int i = (heapSize-2)/2;i>=0;i--)
        {
            maxHeapify(a,i,heapSize);
        }
    }

    public void maxHeapify(int[] a, int i, int heapSize) {      //调整当前结点和子节点的顺序。
       int left = 2*i+1;
       int right = 2*i+2;
       int largest = i;
       if(left<heapSize&&a[left]>a[largest]){
           largest = left;
        }
       if(right<heapSize&&a[right]>a[largest]){
           largest = right;
       }
       if(largest!=i){
           swap(a,i,largest);
           maxHeapify(a,largest,heapSize);
       }
    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}