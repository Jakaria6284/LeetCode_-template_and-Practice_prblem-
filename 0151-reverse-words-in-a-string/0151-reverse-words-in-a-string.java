class Solution {
    public String reverseWords(String s) {
        String nums[]=s.trim().split("\\s+");

        int i=0;
        int j=nums.length-1;

        while(i<j)
        {
            String temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        StringBuilder str=new StringBuilder();
        for(int k=0;k<nums.length;k++)
        {
            str.append(nums[k]);
            str.append(" ");
        }
        str.deleteCharAt(str.length()-1);

        return str.toString();
        
    }
}