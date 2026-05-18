class Solution {
    public int trap(int[] heigthh) {
       int n = heigthh.length;

        int leftMax[]=new int[n];
        leftMax[0]=heigthh[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],heigthh[i]);
        }
        int rightMax[] = new int[n];
        rightMax[n-1]=heigthh[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1], heigthh[i]);
        }

        int tra = 0;


        for(int i=0;i<heigthh.length;i++){
           int  wl =Math.min(leftMax[i], rightMax[i]);
           tra+= wl-heigthh[i];

        }
        return tra; 
    }
}