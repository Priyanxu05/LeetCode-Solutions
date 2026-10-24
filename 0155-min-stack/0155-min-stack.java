class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minstk;
    public MinStack() {
        stack=new Stack<>();
        minstk=new Stack<>();
    }
    
    public void push(int value) {
        stack.push(value);
        if(minstk.isEmpty()||value<=minstk.peek()){
            minstk.push(value);
        }
    }
    
    public void pop() {
        int removed=stack.pop();
        if(removed==minstk.peek()){
            minstk.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstk.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */