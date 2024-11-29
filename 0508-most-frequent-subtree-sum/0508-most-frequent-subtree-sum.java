import java.util.*;

class Solution {
   
    Map<Integer, Integer> freqMap = new HashMap<>();
    int maxFreq = 0;

    public int[] findFrequentTreeSum(TreeNode root) {
        sumSum(root);
        List<Integer> result = new ArrayList<>();

        
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                result.add(entry.getKey());
            }
        }

        // Convert the list to an array and return
        int[] nums = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            nums[i] = result.get(i);
        }
        return nums;
    }

    public int sumSum(TreeNode root) {
        // Base case: if the node is null, return 0
        if (root == null) {
            return 0;
        }

       
        int leftSum = sumSum(root.left);
        int rightSum = sumSum(root.right);

        
        int totalSum = root.val + leftSum + rightSum;

       
        freqMap.put(totalSum, freqMap.getOrDefault(totalSum, 0) + 1);

       
        maxFreq = Math.max(maxFreq, freqMap.get(totalSum));

       
        return totalSum;
    }
}
