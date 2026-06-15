class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> min;
    public MinStack() {
        stack = new Stack<Integer>();
        min = new Stack<Integer>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (!min.isEmpty() && min.peek() > val) {
            min.push(val);
        } else {
            if(!min.isEmpty())
                min.push(min.peek());
            else
                min.push(val);
        }
    }
    
    public void pop() {
        stack.pop();
        min.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
