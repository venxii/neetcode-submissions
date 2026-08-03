class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (!st.isEmpty() &&
                (tokens[i].equals("+") ||
                 tokens[i].equals("-") ||
                 tokens[i].equals("*") ||
                 tokens[i].equals("/"))) {

                int a = st.pop();
                int b = st.pop();

                switch (tokens[i]) {
                    case "+":
                        st.push(b + a);
                        break;
                    case "-":
                        st.push(b - a);
                        break;
                    case "*":
                        st.push(b * a);
                        break;
                    case "/":
                        st.push(b / a);
                        break;
                }
            } else {
                st.push(Integer.valueOf(tokens[i]));
            }
        }

        return st.pop();
    }
}