class Solution {
    int findKRotation(int nums[], int n) {
        // code here
        int start = 0;
        int end = n -1;
        if (n == 1) return 0;
        
        
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
                    return mid;
                }
                
                else
                {
                    //move left
                    end = mid - 1;
                }
            }
        }
        
        return start;
    }
}
