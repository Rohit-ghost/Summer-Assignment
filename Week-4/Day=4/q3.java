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

    public int helper(TreeNode root , int[] ans){
        if(root==null){
            return 0;
        }

        int ls=helper(root.left,ans);
        int rs=helper(root.right,ans);

        ans[0]=Math.max(ans[0],Math.max(root.val,Math.max(root.val+ls,Math.max(root.val+rs,root.val+ls+rs))));

        return Math.max(root.val,Math.max(root.val+ls,root.val+rs));
    }
    public int maxPathSum(TreeNode root) {
        int[] ans = {Integer.MIN_VALUE};
        helper(root,ans);
        return ans[0];
        
    }
}
