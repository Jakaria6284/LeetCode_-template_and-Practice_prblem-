class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {

        PriorityQueue<Integer>r1=new PriorityQueue<>(Collections.reverseOrder());
       int sum=0;

        for(int i=0;i<reward1.length;i++)
        {
            r1.offer(reward1[i]-reward2[i]);
            sum+=reward2[i];

           
        }
        
        
        for(int i=0;i<k;i++)
        {
            sum+=r1.poll();
        }

      

        
        return sum;
    }
}