class MinStack {

    Stack<int[]> stack;
    public MinStack() {
        
        stack = new Stack<>();
    }
    
    public void push(int value) {
        if(stack.isEmpty())
            stack.push(new int[]{value, value});
        else
        {
            int min = Math.min(value, getMin());
            stack.push(new int[]{value, min});
        }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
      return(stack.peek()[0]);
    }
    
    public int getMin() {
      return(stack.peek()[1]);
    }
}
