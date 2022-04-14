### Given a rotated sorted array, find the minimum element in this array in *O(logn)* time.

## Problem statement: 
- Leetcode : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
- GFG : https://practice.geeksforgeeks.org/problems/minimum-element-in-a-sorted-and-rotated-array3611/1/

## Approach:

Let us take a standard array nums[ ] = 0️⃣1️⃣2️⃣3️⃣4️⃣5️⃣6️⃣7️⃣. We will rotate the array 1 to 7 times, and try to find an algorithm that fits all the 0 to 7 rotations. 
1.  *Rotated once*:  1️⃣2️⃣3️⃣4️⃣5️⃣6️⃣7️⃣0️⃣

We have to find a solution that fits in O(log n) time. Moreover the array given is said to be somewhat sorted. The intuition that should follow with the given constraints is that we have to perform binary search in some way. But we still do not know when to move left and right, i.e., which half to discard. 

I will start anyway, by finding the mid and try to find some relationship with the edge elements which will help us move.

mid = 3 ; nums[mid] = 4️⃣
- is ( 4️⃣ >= nums[end]) ?
- is (nums[mid] >= nums[end]) ? True
- 0️⃣ the minimum element is on the right, so we can choose to move right
- // move right
- move right means: start = mid + 1
- start = 4 ; end = 7 ; mid = 4 +(7-4)/2 = 5
- (nums[mid] >= nums[end]) ? 
- (nums[5] >= nums[7]) ? 
- (6️⃣ >= 0️⃣)? true
- so we move right : start = mid + 1;
- start = 6 ; nums[start] = 7️⃣ ; mid = 6
- if (nums[mid] >= nums[end]) ?
- if (7️⃣ >= 0️⃣) ? True
- so we move right : start = mid + 1
- start = 7 ; end = 7 ; 
- we will stop the loop since start == end
- return 0️⃣
- 0️⃣ = nums[start] so i get a feeling we need to return nums[start]

Conclusions from the first rotation :
- we get an intuition that if (nums[mid] >= nums[end]) is True, we can move right to search for the minimum element
- so if(nums[mid] >= nums[end]) { start = mid + 1; }. I want to however test this observation with a few more rotations.
- we need to stop when start == end
- we are somewhat targetting to return nums[start]

2. *Rotated twice*: 2️⃣3️⃣4️⃣5️⃣6️⃣7️⃣0️⃣1️⃣
