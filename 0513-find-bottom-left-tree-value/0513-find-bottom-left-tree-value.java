import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            return 0; // Return 0 or handle as needed if the tree is empty
        }

        int ans = root.val;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                // Update the answer with the first node's value at each level (leftmost node)
                if (i == 0) {
                    ans = node.val;
                }

                // Add children to the queue for the next level
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return ans; // The leftmost value of the last level
    }
}
