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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        helper1(root1, list1);
        helper2(root2, list2);
        List<Integer> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);

        Collections.sort(result);
        return result;

    }

    public void helper1(TreeNode root1, List<Integer> list1) {
        if (root1 == null) {
            return;
        }
        helper1(root1.left, list1);
        list1.add(root1.val);
        helper1(root1.right, list1);
    }

    public void helper2(TreeNode root2, List<Integer> list2) {
        if (root2 == null) {
            return;
        }
        helper2(root2.left, list2);
        list2.add(root2.val);
        helper2(root2.right, list2);
    }
}