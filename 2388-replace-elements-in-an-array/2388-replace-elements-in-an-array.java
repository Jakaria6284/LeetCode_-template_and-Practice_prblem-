import java.util.HashMap;

class Solution {
    public int[] arrayChange(int[] nums, int[][] op) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int a = 0; a < nums.length; a++) {
            map.put(nums[a], a);
        }

        for (int i = 0; i < op.length; i++) {
            int x = op[i][0];
            int y = op[i][1];
              
            int index = map.get(x); 
            nums[index] = y;
    
            map.remove(x);
            map.put(y, index);
        }
        
        return nums;
    }
}