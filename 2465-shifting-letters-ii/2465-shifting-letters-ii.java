class Solution {
    public String shiftingLetters(String s, int[][] shift) {

        int prefix[] = new int[s.length() + 1];

        for(int i=0;i<shift.length;i++)
        {
            int start=shift[i][0];
            int end=shift[i][1];
            int direction=shift[i][2];

            if(direction==0)
            {
                prefix[start]-=1;
                prefix[end+1]+=1;
            }else if(direction==1)
            {
                prefix[start]+=1;
                prefix[end+1]-=1;
            }

        }



        // int result[]=new int[s.length()];
        char[] nums = s.toCharArray();

        for (int i = 1; i < prefix.length; i++) {
              prefix[i]=prefix[i-1]+prefix[i];
        }

        //char[] nums = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            int shiftValue = (nums[i] - 'a' + prefix[i]) % 26;
            if (shiftValue < 0) shiftValue += 26; // Handle negative shifts
            nums[i] = (char) ('a' + shiftValue);
        }
        return new String(nums);

        

    }
}