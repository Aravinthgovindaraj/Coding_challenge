https://leetcode.com/problems/single-number/
class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
       for(int i =0;i<n-1;i+=2){
        if(nums[i]!=nums[i+1]){
            return nums[i];

        }
       }
       return nums[n-1];
}
}
time complexity = O(nlogn)
space compexity = O(1)
