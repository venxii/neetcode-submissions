class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> st = new Stack<>();
        List<int[]> arr = new ArrayList<>();
        for(int i = 0 ; i < position.length; i++) arr.add(new int[]{position[i],speed[i]});
        arr.sort((a,b) -> b[0] - a[0]);
        double check = (double) (target - arr.get(0)[0])/arr.get(0)[1];
        st.push(check);
        for(int i = 1 ; i < position.length; i++){
            check = (double) (target - arr.get(i)[0])/arr.get(i)[1];
            if (st.peek() < check) st.push(check);
        }
        return st.size();
    }
}
