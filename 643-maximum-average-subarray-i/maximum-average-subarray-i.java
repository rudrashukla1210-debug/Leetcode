class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int winsum = 0;
        for(int i = 0 ; i < k ; i++) {
            winsum += nums[i];
        }
        int maxsum = winsum;
        for(int i = k ; i < nums.length ; i++) {
            winsum = winsum - nums[i-k] + nums[i];
            maxsum = Math.max(maxsum,winsum);
        }
        return (double)maxsum / k; 
    }
}