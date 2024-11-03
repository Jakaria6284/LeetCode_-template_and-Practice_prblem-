import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        // Check if the root is null at the beginning
        if (root == null) {
            return list; // Return empty list for null tree
        }

        queue.offer(root);

        while (!queue.isEmpty()) {
            int len = queue.size();

            // Iterate through all nodes at the current level
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();

                // If it's the last node at this level, add it to the result
                if (i == len - 1) {
                    list.add(node.val);
                }

                // Add children to the queue
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return list;
    }
}
