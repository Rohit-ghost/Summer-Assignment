class Solution {
    int bestDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        findHeight(root);
        return bestDiameter;
    }

    private int findHeight(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);

        bestDiameter = Math.max(bestDiameter, leftHeight + rightHeight);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
