class Solution {
    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;

        return (int)(pow(5,even)*pow(4,odd)%1000000007);
        
    }

    public long pow(long x,long n)
    {
        if(n==0)
        {
            return 1;
        }
        long temp =pow(x,n/2);
        if(n%2==0)
        {
            return (temp*temp)%1000000007;
        }else
        {
            return (x*temp*temp)%1000000007;
        }
    }
}