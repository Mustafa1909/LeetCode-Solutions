class Solution {
    public int removeDuplicates(int[] nums) {
       int tm = 0;
       int f = nums[0];

       nums[tm]=f;
       int n = nums.length;
       tm++;
       
       for(int i=1;i<n;i++){
        if(nums[i]!=f){
            nums[tm++]=nums[i];
            f = nums[i];
        }
       }
       return tm;

    }
}