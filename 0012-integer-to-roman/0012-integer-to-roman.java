import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public String intToRoman(int num) {
      Map<Integer,String>romanMap=new LinkedHashMap<>();

        romanMap.put(1000, "M");
        romanMap.put(900, "CM");
        romanMap.put(500, "D");
        romanMap.put(400, "CD");
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1, "I");

        StringBuilder str=new StringBuilder();

        for(int value:romanMap.keySet())
        {
               while(num>=value)
               {
                str.append(romanMap.get(value));
                num=num-value;
               }
        }


        return str.toString();

    }
}
