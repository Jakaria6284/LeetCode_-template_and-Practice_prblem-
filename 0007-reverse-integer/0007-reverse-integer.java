class Solution {
    public int reverse(int x) {
        //int ans=0;
        long semians=0;

        while(x!=0)
        {
            int rem=x%10;
            semians=semians*10+rem;
            x=x/10;
        }

        if(semians>Integer.MAX_VALUE || semians<Integer.MIN_VALUE)
        
        {
            return 0;
        }
        return (int)semians;
    }
}