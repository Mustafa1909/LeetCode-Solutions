class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;

        
    }
    public static void mergeSort(int nums[],int s,int e){
        if(s>=e){
            return;
        }
        int m = s+(e-s)/2;
        mergeSort(nums,s,m);
        mergeSort(nums,m+1,e);
        merge(nums,s,m,e);



    }
    public static void merge(int nums[],int s,int m,int e){
        int temp[]=new int[e-s+1];
        int i = s;
        int j = m+1;
        int k =0;
        while(i<=m&&j<=e){
            if(nums[i]<nums[j]){
                temp[k++]=nums[i++];
            }else{
                temp[k++]=nums[j++];
            }
        }
        while(i<=m){
            temp[k++]=nums[i++];
        }
        while(j<=e){
            temp[k++]=nums[j++];
        }
        for(k=0,i=s;k<temp.length;k++,i++){
            nums[i]=temp[k];
        }
    }
}