class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int count = 0, maxCount = 0;
        for (int num : nums){
            if (!set.contains(num - 1)){
                count++;
                while (set.contains(num + 1)){ 
                    count++;
                    num++;
                }
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        return maxCount;
    }
}
