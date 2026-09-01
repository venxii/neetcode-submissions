class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashSet<Character> set = new HashSet<>();
        int i = 0, j = 1, max = 1;
        set.add(s.charAt(0));
        while (i <= j && i < s.length() && j < s.length()){
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                max = Math.max(max, set.size());
            }
            else {
                while (i <= j){
                    if (s.charAt(i) != s.charAt(j)){
                        set.remove(s.charAt(i));
                        i++;
                    } else {
                        i++;
                        break;
                    }
                }
                j++;
            }
        }
        return max;
    }
}
