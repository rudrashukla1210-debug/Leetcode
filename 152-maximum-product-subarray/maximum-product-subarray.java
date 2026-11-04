class Solution {
    public int maxProduct(int[] nums) {
         int currmax = nums[0];
         int currmin = nums[0];
        int maxpro = nums[0];
        for(int i = 1 ; i < nums.length ; i++)
        {
           int num = nums[i];
           if(num < 0) {
            int temp = currmax;
            currmax = currmin;
            currmin = temp;
           }
           currmax = Math.max(num, currmax * num);
           currmin = Math.min(num, currmin * num);
           maxpro = Math.max(maxpro , currmax);
        }
        return maxpro;
    }
}