https://leetcode.com/problems/find-the-duplicate-number/
class Solution {
    public int findDuplicate(int[] nums){
    Arrays.sort(nums);
     
        for(int i =0;i<nums.length;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
          
            
        
    }
    return -1;
}
}
time complexity = O(nlogn)
space complexity = O(1)
