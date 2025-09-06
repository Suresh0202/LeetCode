class MyStack {
        Queue<Integer>qu;
    public MyStack() {
            qu=new LinkedList<>();
    }
    
    public void push(int x) {
        int size=qu.size();
        qu.add(x);
        for(int i=1;i<=size;i++)
        {
            qu.add(qu.poll());
        }
    }
    
    public int pop() {
        int val=qu.poll();
        return val;
    }
    
    public int top() {
        return qu.peek();
    }
    
    public boolean empty() {
        return qu.size() == 0;
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