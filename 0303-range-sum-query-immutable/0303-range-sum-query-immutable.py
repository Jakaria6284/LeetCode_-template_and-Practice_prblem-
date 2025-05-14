class NumArray:
    

    def __init__(self, nums: List[int]):
        if nums is None:
            raise ValueError("Input is None")
        self.prefixSum=[0]*(len(nums)+1)
        for i in range(1,len(nums) + 1):
            self.prefixSum[i]=self.prefixSum[i-1]+nums[i-1]
        
        

    def sumRange(self, left: int, right: int) -> int:
        result=self.prefixSum[right+1]-self.prefixSum[left]
        return result
        


# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)