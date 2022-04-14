### Search for a *target* element in a rotated sorted array in O(log n)

Clarifying questions to ask:
- Are the elements in the given array unique? If no, can the target element occur multiple times in the array?
- Sorted in ascending or descending order 

## Problem statement 
- Leetcode : https://leetcode.com/problems/search-in-rotated-sorted-array/ (the given rotated array is sorted in ascending order and all the elements are unique)

## Approach
For array : 4️⃣5️⃣6️⃣7️⃣0️⃣1️⃣2️⃣
We are well equipped to find the pivot element, as discussed previously (). Observe that the arrays (nums[pivot_index] to nums[n-1]) and (nums[0] to nums[pivot_index -1]) are indivisually sorted once. Apply Binary search indivisually on the sorted arrays to find the target element.

One of the array segments will return the position of the *target*, the other will return -1. If the *target* is not present in either half, both halves return -1.
