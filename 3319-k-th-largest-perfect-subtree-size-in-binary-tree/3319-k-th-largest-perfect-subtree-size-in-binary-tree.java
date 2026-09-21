/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     List<Integer>result=new ArrayList<>();
    int dfs(TreeNode root ){
        if(root==null){
            return 0;
        }
        int left=dfs(root.left);
        int right=dfs(root.right);
        if(left==-1||right==-1||left!=right){
            return -1;  
        }
        int size = left+right+1;
            result.add(size); 
            return size;

        
    }
    public int kthLargestPerfectSubtree(TreeNode root, int k) {
        dfs(root);
        
            result.sort(Collections.reverseOrder());
            if (result.size() < k) { 
            return -1; 
            }  
            return result.get(k - 1);
    }
}
