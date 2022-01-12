void cloneStack (Stack<Integer> stack, Stack<Integer> clone){
    //add all the contents of `stack` into clone
    while (!stack.isEmpty())
        clone.push(stack.pop());                             //-------> `clone` has all elements of `stack`, but in reverse order
    
    //we need to perform the exchanging operation stack.size()-1 times
    int size = stack.size();
    
    while (size != 0){                                       //-------> exchanging operation
        int popcount = size;
        int temp = clone.pop();                              //-------> keep this element safe, we will insert later, when the `clone` is empty
        while (popcount != 0){
            stack.push(clone.pop());
            popcount --;
        }
        
        clone.push(temp);                                    //-------> `clone` is empty, now push the `temp` element
        
                                                             //-------> after pushing `temp`, push back the contents of `stack` in `clone`
        while (!stack.isEmpty())
            clone.push(stack.pop());
        
        count--;                                            /*--------> one element (`temp`) got its right place at the end of one loop.
                                                                        so we gotta shift one less element from `clone` to `stack` next time, and so on...*/
    }
}
            
    
