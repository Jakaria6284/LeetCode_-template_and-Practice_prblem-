class Solution {
   // static int step=0;
    public int numberOfSteps(int num) {
        
        int step= stepneed(num,0);
        return step;
    }

    public int  stepneed(int num,int step)
    {
            if(num==0)return step;
            if(num%2==0)
            {
                 return stepneed(num/2,step+1);
            }else
            {
               return stepneed(num-1,step+1);
            }
    }
}