// Time Complexity : O(nlogK)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b -a);
        
        for(int i = 0; i < nums.length; i++){
            pq.add(nums[i]);
        }
        
        for(int i = 0; i < k -1; i++){
            pq.poll();
        }
        
        return pq.poll();
    }
}