/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


class Codec {
    public String serialize(TreeNode root) {
        StringBuilder result = new StringBuilder();
        build(root, result);
        return result.toString();
    }

    private void build(TreeNode node, StringBuilder result) {
        if (node == null) {
            result.append("n,");
            return;
        }

        result.append(node.val).append(",");
        build(node.left, result);
        build(node.right, result);
    }

    public TreeNode deserialize(String data) {
        String[] values = data.split(",");
        int[] index = {0};
        return recover(values, index);
    }

    private TreeNode recover(String[] values, int[] index) {
        if (values[index[0]].equals("n")) {
            index[0]++;
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(values[index[0]++]));
        node.left = recover(values, index);
        node.right = recover(values, index);
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
