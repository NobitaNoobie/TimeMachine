class MyQueue {
    
    Stack<Integer> stack;
    Stack<Integer> helper;

    public MyQueue() {
        stack = new Stack<Integer>();
        helper = new Stack<Integer>();
    }
    
    //goal: x NOT be at top, x should be at bottom. 
    //element that was pushed right at the beginning should be at the bottom
    public void push(int x) {
        while (!stack.isEmpty()){
            //keep the current elements of `stack` temporarily in `helper`
            helper.push(stack.pop());
        }
        
        //then push `x` into `stack`, it is at last, just like queue.
        stack.push(x);
        
        //push back the elements temporarily shifted to `stack` earlier
        while (!helper.isEmpty()){
            stack.push(helper.pop());
        }
    }
    
    public int pop() {
        return stack.pop();
    }
    
    public int peek() {
        return stack.top();
    }
    
    public boolean empty() {
        if (stack.isEmpty())
            return true;
        else
            return false;
    }
}
