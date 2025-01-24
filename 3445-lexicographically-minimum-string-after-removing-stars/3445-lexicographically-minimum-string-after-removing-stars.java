class Solution {
    public String clearStars(String s) {
        if(!s.contains("*"))
        {
            return s;
        }
      
        StringBuilder result = new StringBuilder();
        PriorityQueue<Character> pq= new PriorityQueue<>();
        for (char c : s.toCharArray()) {
            if (c != '*') {
                result.append(c);
                pq.offer(c); 
            } else if (!pq.isEmpty()) {
                char minChar =pq.poll();
                result.deleteCharAt(result.lastIndexOf(String.valueOf(minChar)));
            }
        }
        return result.toString();
        
    }
}