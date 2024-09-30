class Solution {
    public String originalDigits(String s) {

        int []lettercount=new int[26];

        for(int ch:s.toCharArray())
        {
            lettercount[ch-'a']++;
        }

        int []count=new int[10];

        count[0]=lettercount['z'-'a'];
         count[2]=lettercount['w'-'a'];
          count[4]=lettercount['u'-'a'];
           count[6]=lettercount['x'-'a'];
            count[8]=lettercount['g'-'a'];

            count[1]=lettercount['o'-'a']-count[0]-count[2]-count[4];
            count[3]=lettercount['h'-'a']-count[8];
            count[5]=lettercount['f'-'a']-count[4];
            count[7]=lettercount['s'-'a']-count[6];
            count[9]=lettercount['i'-'a']-count[5]-count[6]-count[8];

             StringBuilder result = new StringBuilder();

        // Iterate through each digit from 0 to 9
        for (int i = 0; i <= 9; i++) {
            // Check if count[i] is greater than 0
            while (count[i] > 0) {
                // Add the current digit (i) to the result
                result.append(i);
                // Decrement the count for that digit
                count[i]--;
            }
        }

        return result.toString();

        
    }
}