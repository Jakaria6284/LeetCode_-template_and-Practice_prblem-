class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length==0)
        {
            return 0;
        }
       Arrays.sort(g);
       Arrays.sort(s);
       int n1=g.length;
       int n2=s.length;
       int count=0;

       int i=0,j=0;

       while(i<n1 && j<n2)
       {
         if(g[i]<=s[j])
         {
            count++;
            i++;
         }
         j++;
       }
      return count;
    }
}