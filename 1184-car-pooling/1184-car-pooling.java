class Solution {
    public boolean carPooling(int[][] trips, int capacity) {

        int[]pick=new int[10001];
        int[]drop=new int[10001];

        for(int i=0;i<trips.length;i++)
        {
            int start=trips[i][1];
            int end=trips[i][2];
            int passanger=trips[i][0];
            pick[start]+=passanger;
            drop[end]+=passanger;
        }
        
        int currentPassanger=0;
        for(int i=0;i<pick.length;i++)
        {
             currentPassanger+=pick[i];
             currentPassanger-=drop[i];

             if(currentPassanger>capacity)
             {
                return false;
             }

        }

        return true;

       
    }
}