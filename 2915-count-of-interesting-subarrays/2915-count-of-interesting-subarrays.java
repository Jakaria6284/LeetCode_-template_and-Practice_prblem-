class Solution {
    public long countInterestingSubarrays(List<Integer> list, int mod, int k) {
        int n=list.size();
        int[]v=new int[n];
        for(int i=0;i<n;i++)
        {
            if(list.get(i)%mod==k)
            {
                v[i]=1;
            }else
            {
                v[i]=0;
            }
        }

        Map<Integer,Long>m=new HashMap<>();
        int p=0;
        long ans=0;
        for(int i=0;i<n;i++)
        {
            p=(p+v[i])%mod;
            if(p==k)
            {
                ans++;
            }
            int rem=p-k;
            if(rem<0)
            rem+=mod;
             ans += m.getOrDefault(rem, 0L);
            m.put(p, m.getOrDefault(p, 0L) + 1);
        }

        return ans;
    }
}