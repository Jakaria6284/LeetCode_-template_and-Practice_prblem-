import java.util.*;

class Solution {
    public boolean lemonadeChange(int[] nums) {
        List<Integer> listOfFiveDollar = new ArrayList<>();
        List<Integer> listOfTenDollar = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 5) {
                listOfFiveDollar.add(nums[i]);
            } 
            else if (nums[i] == 10) {
                if (listOfFiveDollar.size() >= 1) {
                    listOfFiveDollar.remove(listOfFiveDollar.size() - 1);
                    listOfTenDollar.add(nums[i]);
                } else {
                    return false; // No $5 bill available for change
                }
            } 
            else { // nums[i] == 20
                if (listOfTenDollar.size() >= 1 && listOfFiveDollar.size() >= 1) {
                    listOfTenDollar.remove(listOfTenDollar.size() - 1);
                    listOfFiveDollar.remove(listOfFiveDollar.size() - 1);
                } 
                else if (listOfFiveDollar.size() >= 3) {
                    // Remove the last three $5 bills
                    listOfFiveDollar.remove(listOfFiveDollar.size() - 1);
                    listOfFiveDollar.remove(listOfFiveDollar.size() - 1);
                    listOfFiveDollar.remove(listOfFiveDollar.size() - 1);
                } 
                else {
                    return false; // No valid change available
                }
            }
        }
        return true;
    }
}
