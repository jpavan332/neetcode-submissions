class MinStack {

    Deque<Integer> st;
    Deque<Integer> minSt;
    public MinStack() {
        st = new ArrayDeque<>();
        minSt = new ArrayDeque<>();
    }
    
    public void push(int val) {
        st.push(val);
        int currMin = minSt.isEmpty() ? val : Math.min(val, minSt.peek());
        minSt.push(currMin);
        
    }
    
    public void pop() {
            st.pop();
            minSt.pop();
        
    }
    
    public int top() {
        if(!st.isEmpty())
            return st.peek();
        return 0;
    }
    
    public int getMin() {
        return minSt.peek();
        
    }


}
