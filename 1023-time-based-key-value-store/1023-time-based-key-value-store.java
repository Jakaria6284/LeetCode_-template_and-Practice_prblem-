class TimeMap {

    Map<String,List<Pair<String,Integer> > >map;

    public TimeMap() {
        map=new HashMap<>();
        
    }
    
    public void set(String key, String value, int timestamp) {
         if(!map.containsKey(key))
         {
            map.put(key,new ArrayList<>());
         }
         map.get(key).add(new Pair<>(value,timestamp));

        
    }
    
    public String get(String key, int timestamp) {

        String res="";

        if(map.containsKey(key))
        {
            List<Pair<String,Integer>>list=map.get(key);

            int start=0;
            int end=list.size()-1;

            while(start<=end)
            {
                int mid=start+(end-start)/2;

                if(list.get(mid).getValue()<=timestamp)
                {
                    res=list.get(mid).getKey();
                    start=mid+1;

                }else
                {
                     end=mid-1;
                }
            }

           


        }



            return res;
        
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */