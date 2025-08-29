class Solution:
    def nextGreaterElements(self, nums: List[int]) -> List[int]:
        result=[-1]*len(nums)
        stack=[]

        for i in range(2*len(nums)):
            num=nums[i%len(nums)]

            while stack and  num > nums[stack[-1]]:
                result[stack.pop()]=num
            if i<len(nums):
                stack.append(i)
        return result
         
                
        