class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<List<Integer>> st = new Stack<>();

        List<Integer> dummy = new ArrayList<>();
        dummy.add(temperatures[temperatures.length - 1]);
        dummy.add(temperatures.length - 1);
        st.push(dummy);

        int[] res = new int[temperatures.length];
        res[temperatures.length - 1] = 0;

        for (int i = temperatures.length - 2; i >= 0; i--) {
            List<Integer> temp = new ArrayList<>();
            temp.add(temperatures[i]);
            temp.add(i);
            while (st.peek().get(1)!=i){
            if (temperatures[i] < st.peek().get(0)) {
                res[i] = st.peek().get(1) - i;
                st.push(temp);
            } else {
                st.pop();
                if (st.isEmpty()) st.push(temp);
            }
            }
        }

        return res;
    }
}