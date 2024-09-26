class Solution {
    public int countPrimes(int n) {
        int count = 0;

        boolean []isPrime=new boolean[n];

        if(n<=2)
        {
            return 0;
        }

        for(int i=2;i<n;i++)
        {
            isPrime[i]=true;
        }


        for(int i=2;i*i<n;i++)
        {
            if(isPrime[i])
            {
            for(int j=i*i;j<n;j=i+j)
            {
                isPrime[j]=false;
            }
            }
        }

        for(int i=2;i<n;i++)
        {
            if(isPrime[i])
            {
                count++;
            }
        }

        return count;
    }
}  