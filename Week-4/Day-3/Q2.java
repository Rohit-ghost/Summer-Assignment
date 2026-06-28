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
    public void helper(TreeNode root,TreeNode[] pre,boolean[] ans){
        if(root==null){
            return ;
        }

        helper(root.left,pre,ans);
        if(pre[0]!=null  && pre[0].val>=root.val){
            ans[0]=false;
            return;
        }
        pre[0]=root;
        helper(root.right,pre,ans);
    }
    public boolean isValidBST(TreeNode root) {
        boolean ans[]=new boolean[]{true};
        TreeNode[] pre=new TreeNode[1];
        helper(root,pre,ans);
        return ans[0];
        
    }
}
