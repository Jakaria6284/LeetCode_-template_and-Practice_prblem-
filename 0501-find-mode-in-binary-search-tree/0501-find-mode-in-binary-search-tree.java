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
    public int[] findMode(TreeNode root) {
        if(root.val==0) return new int[]{0};
        Map<Integer, Integer> map = new HashMap<>();
        helper(root, map);
         // Find the maximum frequency
        int maxCount = 0;
        for (int count : map.values()) {
            maxCount = Math.max(maxCount, count);
        }

        // List to store modes (values with max frequency)
        List<Integer> modes = new ArrayList<>();
        
        // Add the values with maximum frequency to the list
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                modes.add(entry.getKey());
            }
        }

        // Convert the list to an array
        int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            result[i] = modes.get(i);
        }

        return result;
        

    }

    public void helper(TreeNode root, Map<Integer, Integer> map) {
        if (root == null) {
            return;
        }
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        helper(root.left,map);
        helper(root.right,map);
    }
}