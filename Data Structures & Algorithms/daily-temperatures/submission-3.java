class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        st.push(temperatures.length - 1);

        int[] res = new int[temperatures.length];
        res[temperatures.length - 1] = 0;

        for (int i = temperatures.length - 2; i >= 0; i--) {
            while (st.peek()!=i){
                if (temperatures[i] < temperatures[st.peek()]) {
                    res[i] = st.peek() - i;
                    st.push(i);
                } else {
                    st.pop();
                    if (st.isEmpty()) st.push(i);
                }
            }
        }

        return res;
    }
}