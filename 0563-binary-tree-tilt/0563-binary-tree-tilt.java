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
  public int findTilt(TreeNode root) {
    sum(root);
    return ans;
  }

  private int ans = 0;

  private int sum(TreeNode root) {
    if (root == null)
      return 0;

    final int l = sum(root.left);
    final int r = sum(root.right);
    ans += Math.abs(l - r);
    return root.val + l + r;
  }
}
