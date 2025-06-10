class Solution:
    def numOfSubarrays(self, arr: List[int], k: int, threshold: int) -> int:
        numOfSubArray=0
        sum=0
        for i in range(0,k):
            sum=sum+arr[i]
        if sum/k>=threshold:
            numOfSubArray+=1
        for i in range(k,len(arr)):
            sum=sum+arr[i]
            sum=sum-arr[i-k]
            if sum/k>=threshold:
                 numOfSubArray+=1
        return numOfSubArray



        