class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        if(s.length() < 2)
            return false;
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                st.push(c);
            }
            else if(c == ')' && (st.isEmpty() || st.pop() != '(')){
                return false;
            }
            else if(c == ']' && (st.isEmpty() || st.pop() != '[')){
                return false;
            }
            else if(c == '}' && (st.isEmpty() || st.pop() != '{')){
                return false;
            }

        }
        return st.size() > 0? false:true;
        
    }
}
