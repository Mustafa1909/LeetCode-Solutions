class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum =0;
        int left = 0;
        double max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(i>=k-1){
                double  div = (double)sum / k;
                max = Math.max(max,div);
                 sum-=nums[left];
            left++;

            }
           
        }
        return max;
    }
}