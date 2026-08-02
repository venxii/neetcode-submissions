class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        if (nums.length != set.size()) return true;
        else return false;
    }
}