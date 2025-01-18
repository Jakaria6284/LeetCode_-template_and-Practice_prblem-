class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        Map<String,Integer>map=new HashMap<>();
           PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
            (a, b) -> {
                int valueComparison = b.getValue() - a.getValue(); // Compare by value (descending)
                if (valueComparison != 0) {
                    return valueComparison;
                }
                return a.getKey().compareTo(b.getKey()); // Compare by key (lexicographical order)
            }
        );
        for(int i=0;i<words.length;i++)
        {
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }

         pq.addAll(map.entrySet());

        List<String>list=new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            Map.Entry<String,Integer>val=pq.poll();
            list.add(val.getKey());
        }

        return list;

        
    }
}