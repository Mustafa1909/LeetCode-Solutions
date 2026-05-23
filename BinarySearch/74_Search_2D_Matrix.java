class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int m = matrix.length;
       int n = matrix[0].length;

       int l = 0;
       int r = m*n-1;

       while(l<=r){
        int mi = l+(r-l)/2;
         int ro = mi/n;
         int c = mi%n;

         int va = matrix[ro][c];

         if(va==target){
            return true;
         }else if(va<target){
            l = mi+1; 
         }else{
            r=mi-1;
         }

         
       }
       return false;
    }
}