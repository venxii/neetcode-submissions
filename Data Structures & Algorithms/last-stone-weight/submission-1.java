class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : stones){
            maxHeap.offer(num);
        }
        while (maxHeap.size() > 1){
            int x = maxHeap.poll();
            int y = maxHeap.poll();
            if (x == y) continue;
            else maxHeap.offer(x-y);
        }
        if (maxHeap.size() == 0) return 0;
        else return maxHeap.peek();
    }
}
