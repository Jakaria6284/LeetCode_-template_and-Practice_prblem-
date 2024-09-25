class Solution {
    public boolean isPalindrome(int x) {

        int ans=0;
        boolean neg=false;
        int original=x;
       

        if(x<0)
        {
            neg=true;
            return false;
        }

        while(x!=0)
        {
            int reminder=x%10;
            ans=(ans*10)+reminder;
            x=x/10;
        }

       
        
        return original==ans;
    }
}