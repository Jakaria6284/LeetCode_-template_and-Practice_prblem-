class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
			
			// Trick here is that if you encounter  null between two non-null values, it ain't complete binary tree.
            if (node == null && queue.peek() != null) return false; 
            
            if (node != null)  {
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        
        return true;
    }
}