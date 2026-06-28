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
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int v) { val = v; }
}

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return root != null && dfsHasPath(root, 0, targetSum);
    }

    private boolean dfsHasPath(TreeNode node, int runningSum, int target) {
        if (node == null) return false;
        runningSum += node.val;
        if (node.left == null && node.right == null) return runningSum == target;
        return dfsHasPath(node.left, runningSum, target) || dfsHasPath(node.right, runningSum, target);
    }
}
