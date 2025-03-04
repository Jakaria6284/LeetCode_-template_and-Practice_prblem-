import java.util.*;

class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        List<Integer> list = new ArrayList<>();
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int []preSum=new int[words.length+1];

        for (int i = 0; i < words.length; i++) {
            String temp = words[i];
            if (!temp.isEmpty() && set.contains(temp.charAt(0)) && set.contains(temp.charAt(temp.length() - 1))) {
                preSum[i + 1] = preSum[i] + 1;  // Include current word if valid
            } else {
                preSum[i + 1] = preSum[i];  // Carry forward previous count
            }
        }
        int result[]=new int[queries.length];

        for(int i=0;i<queries.length;i++)
        {
            int start=queries[i][0];
            int end=queries[i][1];
            result[i]=preSum[end+1]-preSum[start];


        }


        return result;


      
    }
}
