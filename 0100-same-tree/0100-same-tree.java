/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int treesize(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode head = queue.poll();
            list.add(head.val);

            if (head.left != null) {
                queue.offer(head.left);
            }
            if (head.right != null) {
                queue.offer(head.right);
            }
        }

        return list.size();
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        int tree1Size = treesize(p);
        int tree2Size = treesize(q);

        if (tree1Size != tree2Size) {
            return false;
        }

        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.offer(p);
        q2.offer(q);

        while (!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode headq1 = q1.poll();
            TreeNode headq2 = q2.poll();

            if (headq1 == null && headq2 == null) {
                continue;
            }
            if (headq1 == null || headq2 == null || headq1.val != headq2.val) {
                return false;
            }

            q1.offer(headq1.left);
             q1.offer(headq1.right);

             q2.offer(headq2.left);
            q2.offer(headq2.right);
        }

        return q1.isEmpty() && q2.isEmpty();
    }
}
