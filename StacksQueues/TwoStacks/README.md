The queue is a FIFO data structure, unlike stack, which is a LIFO data structure. We will get stuck while implementing a queue with a single stack, due to the difference in
the access types of the two data structures. A `helper` stack might come to the rescue. Elements might pe temporarily pushed or popped in and out of `helper`, thus acting like
a temporary space just for the purpose of holding elements. As an analogy we might like to think about the `temp` variable which executes similar utility when 2 elements are to 
be swapped. 

The trick in these type of problems, is to figure out *when* and *how* should elements be pushed and popped in and out of this `helper` stack.
