Given a binary array A[] of size N. The task is to arrange the array in increasing order.
Note: The binary array contains only 0  and 1.

1️⃣0️⃣1️⃣1️⃣0️⃣ ---> 0️⃣0️⃣1️⃣1️⃣1️⃣ 

1️⃣0️⃣0️⃣1️⃣1️⃣1️⃣ ---> 0️⃣0️⃣1️⃣1️⃣1️⃣1️⃣
___
## APPROACH 1️⃣:
The problem wants us to print all the 1's after all the 0's.

Hmmm... 🤔

Why not count the number of zeroes and then then number of ones and then place the groups of 0's and 1's one after the other.

Yess... 😁

That could work!

``` Java
public void arrange (int[] nums){
  int zeroes = 0; // counts the number of zeroes
  int ones = 0; // counts the number of ones
  int n = nums.length;
  
  // Run a loop over the array and keep track of the number of zeroes and ones
  for (int i = 0 ; i<n; i++){
    if (nums[i] == 0) zeroes++;
    else ones++;
  }
  
  // arrange the zeroes first
  for (int i = 0; i <= zeroes-1; i++)
    nums[i] = 0;
    
  // arrange the ones starting from the index zeroes ended
  for (int i = zeroes; i<n; i++)
    nums[i] = 1;
}
```
___
## APPROACH 2️⃣ :

Thinking about solving with pointers won't hurt. 

My plan is to keep two pointers, ``high`` and ``low``, and as we move along the array, we try to swap ``high`` and ``low`` such that it follows these contrains: 

  (i) if ``nums[low] == 0`` we do not need to disturb the element, because 0's are to remain in the front of the array. Just increase ``low`` pointer.
  
  (ii) if ``nums[low] == 1`` we need to send it to the back, because 1's belong to the back of the array. We do this by swapping it with the element at ``high`` which is nothing 
but the ``n-1``th position in the array (last position).

  (iii) After we are done with the above checking, we can update ``low`` to the 2nd position in the array and update ``high`` to the second last position in the array.
  
  (iv) Continue this until high meets low
  
  ```Java
  /* code snippet for the two pointer approach */
  int n = nums.length;
  int low = 0;
  int high = n-1;
  
  while (low <= high){        // (iv)
    if (nums[low] == 0)       // (i)
      low ++;
      
    if (nums[low] == 1)      // (ii)
      {
        int temp = nums[high];
        nums[high] = nums[low];
        nums[low] = temp;
        
        low ++;
        high --;
      }
  }
  ```
  
  Let us dry-run this code on our examples. (``low`` and ``high`` are the left and right highlighted ones, respectively)
  
 Example 1:  1️⃣0 1 10️⃣ (swap) ---> 0️⃣0 1 11️⃣ --> 00️⃣11️⃣1 (don't swap) --> 0 01️⃣1 1 (stop) ✔
 
 Example 2:  1️⃣0 0 1 11️⃣ (swap) ---> 1️⃣0 0 1 11️⃣ --> 10️⃣0 11️⃣1 ❌ The position of the first 1 didn't change at all!
 
 We will therefore need to write one more condition to handle the case: if ``nums[low] == 1``. In this case, we SHOULD NOT SWAP. 
 Instead, we should do `high--` until a 0 is encountered and, 
 `low` remains at its place. 
 
 In all other cases, we swap ``high`` and ``low``
 
 The implementation is done in the following code:
  
___


## APPROACH 2️⃣ (modified):
``` Java
public void arrange (int[] nums)
{
  int n = nums.length;
  int low = 0;
  int high = n-1;
  
  while (low <= high){
    
    if (nums[low] == 0)
      low ++;
     
    else if (nums[low] == 1 && nums[high] == 1)
      high --;
      
    else{
      //     nums[low] == 1 && nums[high] != 1
      //     in this case it is safe to swap
      
        int temp = nums[high];
        nums[high] = nums[low];
        nums[low] = temp;
        
        low ++;
        high --;
    }
}
```

