class Solution {
    public int countOfSubstrings(String word, int k) {
       int res=0;
      
       HashSet<Character>set=new HashSet<>();
       set.add('a');
        set.add('e');
         set.add('i');
          set.add('o');
           set.add('u');
       
       for(int start=0;start<word.length();start++)
       {
               HashSet<Character>set2=new HashSet<>();
                int consonent=0;

               for(int end=start;end<word.length();end++)
               {
                if(set.contains(word.charAt(end)))
                {
                   set2.add(word.charAt(end));
                }else if (Character.isLetter(word.charAt(end)))
                {
                    consonent++;
                }

                if(set2.size()==5 && consonent==k)
                {

                    res++;
                  //  consonent=0;
                }

                if(consonent>k)
                {
                    //consonent=0;
                    break;
                }
               }
       }

       return res;
    }
}