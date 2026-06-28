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
    int index = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return construct(preorder, inorder, 0, inorder.length - 1);
    }

    private TreeNode construct(int[] preorder, int[] inorder, int left, int right) {
        if (left > right) return null;

        int rootValue = preorder[index++];
        TreeNode root = new TreeNode(rootValue);

        int split = left;
        while (inorder[split] != rootValue) {
            split++;
        }

        root.left = construct(preorder, inorder, left, split - 1);
        root.right = construct(preorder, inorder, split + 1, right);

        return root;
    }
}
