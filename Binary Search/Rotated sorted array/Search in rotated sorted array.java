class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int pos = pivotpos (nums);
        int left = binarySearch (nums,0,pos-1,target);
        int right = binarySearch (nums,pos,n-1,target);
        
        if (right == -1 && left == -1)
            return -1;
        else if (right == -1 && left != -1)
            return left;
        return right;
    }
    
    public int pivotpos (int[]nums) {
        //find the position of the pivot element, that is the position of the minimum element
        int n = nums.length;
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
    
    public int binarySearch (int[]nums , int start, int end, int target)
    {
        while (start <= end)
        {
            int mid = start + (end - start)/2;
            if (target == nums[mid])
            {
                return mid;
            }
            
            else if (target < nums[mid])
            {
                end = mid - 1;
            }
            
            else if (target > nums[mid])
            {
                start = mid + 1;
            }
        }
        return -1;
    }
    
}
