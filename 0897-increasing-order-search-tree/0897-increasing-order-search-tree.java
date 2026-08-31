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
     TreeNode current;
    void Inorder(TreeNode root){
        if(root==null){
            return ;
        }
        Inorder(root.left);
       
        current.right=root;
        root.left=null;
        current=root;
        Inorder(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
       TreeNode dummy=new TreeNode(0);
       current=dummy;
       Inorder(root);
       return dummy.right;

    }
}