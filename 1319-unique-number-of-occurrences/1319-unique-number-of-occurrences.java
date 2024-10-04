class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer>set=new HashSet<>();

        Map<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(int i=0;i<arr.length;i++)
        {
            set.add(map.get(arr[i]));
        }

        if(set.size()==map.size())
        {
            return true;
        }

        return false;
        
    }
}