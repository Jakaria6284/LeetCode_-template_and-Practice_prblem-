class Solution {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;

       
        int count = pathSumHelper(root, sum, 0);

       
        count += pathSum(root.left, sum);
        count += pathSum(root.right, sum);

        return count;
    }

    private int pathSumHelper(TreeNode root, int sum, long currentSum) {
        if (root == null) {
            return 0;
        }

        
        currentSum += root.val;

       
        int count = (currentSum == sum) ? 1 : 0;

       
        count += pathSumHelper(root.left, sum, currentSum);
        count += pathSumHelper(root.right, sum, currentSum);

        return count;
    }
}
