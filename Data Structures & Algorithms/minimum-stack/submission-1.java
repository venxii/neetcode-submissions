class MinStack {
    Stack<Integer> st;
    Stack<Integer> aux;
    public MinStack() {
        st = new Stack<>();
        aux = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if (aux.isEmpty() || val <= aux.peek()) aux.push(val);
    }
    
    public void pop() {
        int val = st.pop();
        if (val == aux.peek()) aux.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return aux.peek();
    }
}
