                                               /* Recursive */
public List<Integer> inorder (TreeNode root){
    List<Integer> list = new ArrayList<Integer>();
    
    if (root == null)
        return list;
    
    if (root.left != null) return inorder(root.left);
    list.add(root.val);
    if (root.right != null) return inorder(root.right);
    
    return list;
}

                                               /* Iterative */
public List<Integer> inorder (TreeNode root){
    List<Integer> list = new ArrayList<Integer>();
    
    if (root == null) return list;
    
    Stack<TreeNode> stack = new Stack<TreeNode>();
    TreeNode travNode = root;
    
    while (travNode!= null){
        stack.push(travNode);
        travNode = travNode.left;
    } // at the end of this loop we will have, stack.pop() = leftmost leaf of tree
    //and the next element in the stack is the node correspong to the leftmost leaf
    //if we did not store the corresponding node, it would have been difficult to access the right node
    
    while (!stack.isEmpty()){
        TreeNode current = stack.pop();
        list.add(current.val);
        
        current = current.right;
        
        if (current != null){ //right subtree
            while (current.left != null){
                stack.push(current);
                current = current.left;
            } //at the end of this loop, we will have stack.top() = leftmost root of the right subtree
        }
        return list;
    }
