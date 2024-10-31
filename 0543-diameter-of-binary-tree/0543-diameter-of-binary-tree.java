class Solution {
    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return maxDiameter;
    }

    private int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftDepth = depth(node.left);
        int rightDepth = depth(node.right);

        // Update the maximum diameter found so far
        maxDiameter = Math.max(maxDiameter, leftDepth + rightDepth);

        // Return the height of the current node
        return Math.max(leftDepth, rightDepth) + 1;
    }
}