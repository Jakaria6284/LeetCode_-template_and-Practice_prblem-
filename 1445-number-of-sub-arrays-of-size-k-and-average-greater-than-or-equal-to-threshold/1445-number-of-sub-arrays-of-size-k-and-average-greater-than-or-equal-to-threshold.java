class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int currentSum=0;
        int avg=0;

        for(int i=0;i<k;i++)
        {
          currentSum+=arr[i];
        }
        avg=currentSum/k;
        if(avg>=threshold){
            count++;
        }

        for(int i=k;i<arr.length;i++)
        {
            int avgg=0;
            currentSum+=arr[i]-arr[i-k];
            avgg=currentSum/k;
            if(avgg>=threshold)
            {
                count++;
            }
        }

        return count;
        
    }
}