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
