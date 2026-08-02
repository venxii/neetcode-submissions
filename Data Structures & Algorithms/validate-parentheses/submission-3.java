class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if (s.length()%2 != 0) return false;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.add(s.charAt(i));
            } else {
            if (!st.isEmpty() && (ch == ')' && st.peek() == '(' || ch == '}' && st.peek() == '{' || ch == ']' && st.peek() == '[')){
                st.pop();
            }else return false;
            }
            
        }
        if (st.isEmpty()) return true;
        else return false;
    }
}
