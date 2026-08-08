class Solution {
    public int removeDuplicates(int[] nums) {
        int newidx=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[newidx]){
            newidx++;
             nums[newidx]=nums[i];
                
            }
        }
        return newidx+1;
    }
}