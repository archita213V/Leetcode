class Solution {
    public int trap(int[] height) {
       Stack<Integer> st=new Stack<>();
       int n=height.length;
       int left=0;
       int w=0;
       for(int i=0;i<n;i++){
        while(!st.isEmpty() && height[i]>height[st.peek()]){
            int bottom=st.pop();
            if(st.isEmpty()){
                break;
            }
            left=st.peek();
            int width=i-left-1;
            int boundedheight=Math.min(height[left],height[i])-height[bottom];
            w+=width*boundedheight;
        }
        st.push(i);
       }
       return w;
    }
}