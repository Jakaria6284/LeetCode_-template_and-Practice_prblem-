class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
       int i = 0;
       int j = 0,count = 0;

       while (i < str2.length() && j < str1.length()){
           if(str2.charAt(i) == str1.charAt(j)){
               count++;
                      i++;
                      j++;
           }
           else if (str1.charAt(j) != 'z' && str2.charAt(i) == (char)(str1.charAt(j)+1)){
              
                   count++;
                   i++;
                   j++;
           }
           else if (str1.charAt(j) == 'z' && str2.charAt(i) =='a'){
               count++;
                     i++;
                     j++;
           }
           else 
            j++;
           
       }

       return count == str2.length();
    }
}