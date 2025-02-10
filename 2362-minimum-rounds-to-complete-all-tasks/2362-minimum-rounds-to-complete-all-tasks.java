class Solution {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        Map<Integer,Integer>map=new HashMap<>();
        int count=0;

        for(int i=0;i<tasks.length;i++)
        {
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }

        for(Map.Entry<Integer,Integer>entry:new ArrayList<>(map.entrySet()))
        {
            int key=entry.getKey();
            int val=entry.getValue();
            if(val==1)return -1;

            while(val>=3)
            {
                val=val-3;
                count++;
                
            }

            if(val>0)
            {
                count++;
               
            }
        }

        return count;
        
    }
}