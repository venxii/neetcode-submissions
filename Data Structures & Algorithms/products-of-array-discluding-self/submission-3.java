class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1, zeroCount = 0, hasZeroInd = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                hasZeroInd = i;
                zeroCount++;
                continue;
            }
            product *= nums[i];
        }
        
        int[] res = new int[nums.length];
        if (hasZeroInd == -1) {
            for (int i = 0; i < nums.length; i++) {
                res[i] = product/ nums[i];
            }
        } else {
            Arrays.fill(res,0);
            if (zeroCount < 2) res[hasZeroInd] = product;
        }
        return res;
    }
}  
