class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for(int i = 0; i < tasks.length; i++)
            count[tasks[i] - 'A']++;
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : count){
            if (num > 0) maxHeap.offer(num);
        }

        Queue<int[]> q = new LinkedList<>();
        int time = 0;
        while (!maxHeap.isEmpty() || !q.isEmpty()){
            time++;
            if (maxHeap.isEmpty()) time = q.peek()[1];
            else {
                int freq = maxHeap.poll() - 1;
                if (freq > 0) q.offer(new int[]{freq, time + n});
            }

            if (!q.isEmpty() && q.peek()[1] == time)
                maxHeap.add(q.poll()[0]);
        }
        return time;
    }
}
