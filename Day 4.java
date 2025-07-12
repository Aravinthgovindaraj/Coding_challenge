https://leetcode.com/problems/maximum-subarray/
Kadane’s Algorithm
class Solution {
    public int maxSubArray(int[] nums) {
       int maxsum = nums[0];
       int currentsum = nums[0];
       for(int i =1;i<nums.length;i++){
        currentsum = Math.max(nums[i],currentsum+=nums[i]);
        maxsum = Math.max(maxsum,currentsum);
       }
       return maxsum;
}
}
time complexity = O(n)
space complexity = O(1)

brute force approach
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        
        return maxSum;
    }
}
timecomplexity = O(n)
spacecomplexity =O(1)
