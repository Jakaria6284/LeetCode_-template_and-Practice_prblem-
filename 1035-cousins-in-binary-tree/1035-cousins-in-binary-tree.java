class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean foundX = false, foundY = false;
            Integer parentX = null, parentY = null;
            
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                // Check left child
                if (node.left != null) {
                    queue.offer(node.left);
                    if (node.left.val == x) {
                        foundX = true;
                        parentX = node.val;
                    } else if (node.left.val == y) {
                        foundY = true;
                        parentY = node.val;
                    }
                }
                
                // Check right child
                if (node.right != null) {
                    queue.offer(node.right);
                    if (node.right.val == x) {
                        foundX = true;
                        parentX = node.val;
                    } else if (node.right.val == y) {
                        foundY = true;
                        parentY = node.val;
                    }
                }
            }

            // After checking all nodes at the current level
            if (foundX && foundY) {
                return !parentX.equals(parentY); // true if different parents
            } else if (foundX || foundY) {
                return false; // only one found at this level
            }
        }
        
        return false;
    }
}
