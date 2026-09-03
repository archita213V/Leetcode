class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int []nums2=new int[n];
        return solve(nums1,0,nums2);
    }
    boolean solve(int []nums1,int index,int []nums2 ){
        if(index==nums1.length){
            return sameParity(nums2);
        }
        nums2[index]=nums1[index];
        if(solve(nums1,index+1,nums2)){
            return true;
        }
        for(int j=0;j<nums1.length;j++){
            if(j==index){
                continue;
            }
            nums2[index]=nums1[index]-nums1[j];
            if(solve(nums1,index+1,nums2)){
                return true;
            }
        }
            return false;
        }
        boolean sameParity(int []nums){
            int parity=nums[0]%2;
            for(int i=0;i<nums.length;i++){
                if(nums[0]%2!=parity){
                    return false;
                }
            }
            return true;
        }
    }
