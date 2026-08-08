class Solution {
    public int leastInterval(char[] tasks, int n) {
        if (n == 0) return tasks.length;
        int[] count = new int[26];
        for(int i = 0; i < tasks.length; i++)
            count[tasks[i] - 'A']++;
        int max = Arrays.stream(count).max().orElse(0);
        int maxCount = 0;
        for(int i = 0; i < count.length; i++)
            if (count[i] == max) maxCount++;
        return Math.max(((n+1)*(max-1)) + maxCount, tasks.length);
    }
}
