class Solution:
    def minimumRemoval(self, beans: List[int]) -> int:
        beans.sort()
        result = float('inf')
        total = sum(beans)
        n=len(beans)
        prefixSum=[0]*(len(beans)+1)
        for i in range(len(beans)):
            prefixSum[i+1]=prefixSum[i]+beans[i]
        for i in range(len(beans)):
            ans=prefixSum[i]+total-prefixSum[i+1]-beans[i]*(n-(i+1))
            result=min(result,ans)
           
        return result
