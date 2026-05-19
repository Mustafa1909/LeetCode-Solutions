class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int lef = 0;
       int sum = 0;
       int min = Integer.MAX_VALUE;
       for(int ri= 0;ri<nums.length;ri++){
        sum+=nums[ri];
        while(sum>=target){
            min = Math.min(min,ri-lef+1);

            sum-=nums[lef];
            lef++;
        }
       }
       return min==Integer.MAX_VALUE?0:min;
    }
}