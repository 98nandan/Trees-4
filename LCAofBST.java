// TC: O(n) where n is the number of nodes in the tree.
// SC: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class LCAofBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // SC: O(h) where h is the height of the tree.
        // if(root.val > p.val && root.val > q.val) {
        //     return lowestCommonAncestor(root.left, p, q);
        // }
        // else if(root.val < p.val && root.val < q.val) {
        //     return lowestCommonAncestor(root.right, p, q);
        // }
        // else {
        //     return root;
        // }
        while(true) {
            if(root.val > p.val && root.val > q.val) {
                root = root.left;
            }
            else if(root.val < p.val && root.val < q.val) {
                root = root.right;
            }
            else {
                return root;
            }
        }
    }
}