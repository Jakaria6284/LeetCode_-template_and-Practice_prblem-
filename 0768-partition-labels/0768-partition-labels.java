class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();

        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
            }
        }

        int max = 0, prev = -1;
        
        for (int i = 0; i < s.length(); i++) {
            max = Math.max(max, map.get(s.charAt(i))); 

            if (i == max) { 
                list.add(i - prev); 
                prev = i; 
            }
        }

        return list;
    }
}
