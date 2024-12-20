class Solution {
    public String frequencySort(String s) {

        StringBuilder str = new StringBuilder();
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        while(!map.isEmpty())
        {
            int max=0;
            char maxchar='a';
            for(Map.Entry<Character,Integer>e:map.entrySet())
            {
                if(e.getValue()>max)
                {
                    max=e.getValue();
                    maxchar=e.getKey();
                }
            }

            for(int i=0;i<max;i++)
            {
                str.append(maxchar);
            }
            map.remove(maxchar);
        }
        return str.toString();
    }
}