class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
        
    }
    
    public void push(int x) {
        q.offer(x);
        
    }
    
    public int pop() {
        int n = q.size();
        for(int i =0 ; i< n-1; i++){
            int poppedEle = q.poll();
            q.offer(poppedEle);
        }
        return q.poll();
        
    }
    
    public int top() {
        Iterator<Integer> it = q.iterator();
        int val = 0;
        while(it.hasNext()){
            val = it.next();
        }
        return val;
        
    }
    
    public boolean empty() {
        return q.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */