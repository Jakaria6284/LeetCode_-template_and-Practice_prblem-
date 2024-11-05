import java.util.LinkedList;
import java.util.Queue;

class Solution {

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(root, 0));
        int maxWidth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int start = 0, end = 0;
            
            for (int i = 0; i < size; i++) {
                Pair<TreeNode, Integer> current = queue.poll();
                TreeNode node = current.getKey();
                int index = current.getValue();

                if (i == 0) start = index;
                if (i == size - 1) end = index;

                if (node.left != null) {
                    queue.add(new Pair<>(node.left, 2 * index));
                }
                if (node.right != null) {
                    queue.add(new Pair<>(node.right, 2 * index + 1));
                }
            }

            maxWidth = Math.max(maxWidth, end - start + 1);
        }

        return maxWidth;
    }
}
