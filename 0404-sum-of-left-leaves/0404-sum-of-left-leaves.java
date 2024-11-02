class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            // Check if the left child exists and is a leaf node
            if (node.left != null && node.left.left == null && node.left.right == null) {
                sum += node.left.val;
            } else if (node.left != null) {
                // Add left child to the queue if it's not a leaf
                queue.offer(node.left);
            }

            // Always add the right child to the queue if it exists
            if (node.right != null) {
                queue.offer(node.right);
            }
        }

        return sum;
    }
}
