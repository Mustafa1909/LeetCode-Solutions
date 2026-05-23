class Solution {
    public int[] searchRange(int[] nums, int target) {
       int f = first(nums,target);
        int l = last(nums,target);
        return new int[]{f,l};
    }

     public int first(int[] nums, int target){
           int s = 0;
        int e = nums.length-1;
        int ans = -1;


        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[m]==target){
                ans=m;
                e=m-1;
            }else if(nums[m]<target){
               s=m+1;
            }else{
                e=m-1;
            }
        }
        return ans;
     }
         public int last(int[] nums, int target){
           int s = 0;
        int e = nums.length-1;
        int ans = -1;


        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[m]==target){
                ans=m;
                s=m+1;
            }else if(nums[m]<target){
               s=m+1;
            }else{
                e=m-1;
            }
        }
        return ans;
     }
    }
