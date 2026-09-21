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
    int count=0;
    int Inorder(TreeNode root,int k){
        
        if(root==null){
            return -1;
        }
        int ans=Inorder(root.left,k);
        if(ans!=-1){
            return ans;
        }
       count++;
       if(count==k){
        return root.val;
      
       }
       return Inorder(root.right,k);
        
    }
    public int kthSmallest(TreeNode root, int k) {
       return Inorder(root,k);
   }
}