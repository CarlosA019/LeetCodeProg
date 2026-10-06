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

    List<TreeNode> result = new ArrayList<>();
    Set<Integer> deleteSet = new HashSet<>();

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {

        // Add every value we want to delete into the HashSet
        for (int i = 0; i < to_delete.length; i++) {
            deleteSet.add(to_delete[i]);
        }

        // Process the whole tree
        root = dfs(root);

        // If the original root was not deleted,
        // it is still one of the roots in the forest
        if (root != null) {
            result.add(root);
        }

        return result;
    }

    private TreeNode dfs(TreeNode node) {

        // Base case
        if (node == null) {
            return null;
        }

        // Process the left and right children first
        node.left = dfs(node.left);
        node.right = dfs(node.right);

        // If this node should be deleted
        if (deleteSet.contains(node.val)) {

            // If the left child survived, it becomes a new tree root
            if (node.left != null) {
                result.add(node.left);
            }

            // If the right child survived, it becomes a new tree root
            if (node.right != null) {
                result.add(node.right);
            }

            // Return null so the parent removes this node
            return null;
        }

        // Otherwise, keep this node
        return node;
    }
}
