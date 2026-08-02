class Solution {
    public int trap(int[] height) {
       int l=0;
       int r=height.length-1;
       int leftmax=0;
       int rightmax=0;
       int w=0;
       while(l<r){
        if(height[l]<height[r]){ //process left
            if(height[l]>=leftmax){
                leftmax=height[l];
            }
            else{
                w+=leftmax-height[l];
            }
            l++;
        }
        else{
            if(height[r]>=rightmax){
                rightmax=height[r];
            }
            else{
                w+=rightmax-height[r];
            }
            r--;
        }
       }
       return w;
    }
}