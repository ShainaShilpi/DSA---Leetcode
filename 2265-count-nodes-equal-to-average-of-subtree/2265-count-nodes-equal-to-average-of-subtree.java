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
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public int averageOfSubtree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int[] count = new int[1];
        dfs(root, count);
        return count[0];
    }

    private int[] dfs(TreeNode node, int[] count) {
        if (node == null) {
            return new int[]{0, 0};
        }

        int[] left = dfs(node.left, count);
        int[] right = dfs(node.right, count);

        int totalSum = left[0] + right[0] + node.val;
        int totalCount = left[1] + right[1] + 1;
        int avg = totalSum / totalCount;

        if (node.val == avg) {
            count[0]++;
        }

        return new int[]{totalSum, totalCount};
    }
}
