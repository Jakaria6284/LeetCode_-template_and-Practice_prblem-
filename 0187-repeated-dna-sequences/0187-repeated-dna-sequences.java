class Solution {
    public List<String> findRepeatedDnaSequences(String s) {

        List<String>list=new ArrayList<>();
        Map<String,Integer>map=new HashMap<>();

        for(int i=0;i<=s.length()-10;i++)
        {
            String subStr=s.substring(i,i+10);
            map.put(subStr,map.getOrDefault(subStr,0)+1);

        }

         for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
           if(value>=2)
           {
            list.add(key);
           }
        }

        return list;
        
    }
}