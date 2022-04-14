class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n -1;
        if (n == 1) return nums[0];
        if (n == 2) return Math.min(nums[0] , nums[1]);
        
        while (start < end)
        {
            int mid = start + (end - start)/2;
            
            if (nums[mid] >= nums[end])
            {
                //move right
                start = mid + 1;
            }
            
            else if (nums[mid] < nums[end])
            {
                //2 conditions
                if ((nums[mid] < nums[(mid-1+n)%n]) && (nums[mid] < nums[(mid+1)%n]))
                {
                    return nums[mid];
                }
                
                else
                {
                    //move left
                    end = mid - 1;
                }
            }
        }
        
        return nums[start];
    }
}
