package leetcode;
//leetcode_622设计循环队列
//哥们我真服了一会还要去医院
public class MyCircularQueue {
    private int[] CircularQueue;
    private int head;
    private int count;
    private int capacity;
    public MyCircularQueue(int k) {
        this.CircularQueue = new int[k];
        this.head = 0;
        this.count = 0;
        this.capacity = k;
    }

    public boolean enQueue(int value) {
        if(this.isFull()){
            return false;
        }else{
            this.CircularQueue[(this.head+this.count)%this.capacity] = value;
            this.count++;
            return true;
        }
    }

    public boolean deQueue() {
        if(this.isEmpty()) return false;
        this.head = (this.head + 1) % this.capacity;
        this.count--;
        return true;
    }

    public int Front() {
        if(this.isEmpty()) return -1;
        return CircularQueue[this.head];
    }

    public int Rear() {
        if(this.isEmpty()) return -1;
        int tail = (this.head + this.count - 1) % capacity;
        return CircularQueue[tail];
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public boolean isFull() {
        return (this.count == this.capacity);
    }
}
