class Solution:
    def minOperations(self, nums: List[int], x: int) -> int:
        target=sum(nums)-x
        left=0
        right=0
        maxlen=-1
        summ=0

        for right in range(len(nums)):
            summ+=nums[right]
            while left<=right and summ>target:
                summ-=nums[left]
                left+=1
            if summ==target:
                maxlen=max(maxlen,right-left+1)
        if maxlen==-1:
            return maxlen
        return len(nums)-maxlen
        