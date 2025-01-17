
class Pair {
    int index;
    int value;

    public Pair(int index, int value) {
        this.index = index;
        this.value = value;
       
    }
}

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        PriorityQueue<Pair>pq=new PriorityQueue<>(  (a, b) -> a.value == b.value ? a.index - b.index : a.value - b.value);

        for(int i=0;i<mat.length;i++)
        {
            int count=0;
            for(int j=0;j<mat[0].length;j++)
            {
               if(mat[i][j]==1)
               {
                count++;
               }
               
            }
            pq.add(new Pair(i,count));
        }

        int []nums=new int[k];

        for(int i=0;i<nums.length;i++)
        {
            Pair pair=pq.poll();
            nums[i]=pair.index;
        }

        return nums;
    }
}