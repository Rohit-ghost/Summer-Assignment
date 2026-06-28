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
    public boolean isSymmetric(TreeNode root) {
        return root == null || check(root.left, root.right);
    }

    private boolean check(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null || rightNode == null) return leftNode == rightNode;
        if (leftNode.val != rightNode.val) return false;

        return check(leftNode.left, rightNode.right) && check(leftNode.right, rightNode.left);
    }
}
