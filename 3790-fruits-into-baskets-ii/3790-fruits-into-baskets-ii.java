class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int m = baskets.length;
        int count = 0;
       // Arrays.sort(baskets);

        for (int i = 0; i < n; i++) {
            boolean place=false;
            for (int j = 0; j < m; j++) {
                if (fruits[i] <= baskets[j]) { 
                    baskets[j]=-1;
                    place=true;
                    break;
                    
                }
            }
            if (place==false) { // If no suitable basket found, count as unplaced
                count++;
            }
        }
        return count;
    }
}