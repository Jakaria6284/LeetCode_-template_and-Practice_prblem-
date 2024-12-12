/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    int i=0;
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
       helper(root,list);
       return makeTree(list);
       

    }
    public TreeNode makeTree(List<Integer> list) {
    if (list == null || list.isEmpty()) {
        return null;  // Return null if the list is empty
    }

    TreeNode root = new TreeNode(list.get(0));  // Create the root node
    TreeNode current = root;  // This will keep track of the current node

    // Iterate through the list starting from the second element
    for (int i = 1; i < list.size(); i++) {
        TreeNode newNode = new TreeNode(list.get(i));  // Create a new node
        current.right = newNode;  // Set the right child of the current node
        current.left = null;  // Ensure the left child is null
        current = newNode;  // Move to the new node
    }

    return root;  // Return the root of the tree
}

    public void helper(TreeNode root,List<Integer>list)
    {
         if (root == null)
            return ;
        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);
    }
}