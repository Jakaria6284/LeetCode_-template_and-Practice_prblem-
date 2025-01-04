class Solution {
    public long smallestNumber(long num) {
       
       if(num>0)
       {
       String s = Long.toString(num);
        char []c=s.toCharArray();
        Arrays.sort(c);
         
         int i=0,j=0;
         
            if(c[0]=='0')
            {
                while(c[j]=='0')
                {
                    j++;
                }

                char temp=c[i];
                c[i]=c[j];
                c[j]=temp;
            }

            StringBuilder str=new StringBuilder();
            for(char c1:c)
            {
                str.append(c1);
            }
         
         return Long.parseLong(str.toString());
        




       }
       else
       {
        String s=Long.toString(num);
        s=s.replace("-","");
        char []c=s.toCharArray();
        Arrays.sort(c);
        StringBuilder str=new StringBuilder();
        for(char c1:c)
        {
             str.append(c1);
        }
         return (-1)*Long.parseLong(str.reverse().toString());
       }
    }
}