import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            int max = Integer.MIN_VALUE;  // Initialize max for the current level

            for (int i = 0; i < size; i++) {
                TreeNode head = queue.poll();
                max = Math.max(max, head.val);  // Find max value for the current level

                if (head.left != null) {
                    queue.offer(head.left);
                }
                if (head.right != null) {
                    queue.offer(head.right);
                }
            }

            result.add(max);  // Add the max value of the current level to result
        }

        return result;
    }
}
