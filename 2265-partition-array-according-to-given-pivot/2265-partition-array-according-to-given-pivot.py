class Solution:
    def pivotArray(self, nums: List[int], pivot: int) -> List[int]:
        ans = [0] * len(nums)  
        idx = 0
        n = len(nums)

        for i in range(0, n):
            if nums[i] < pivot:
                ans[idx] = nums[i]
                idx += 1
        
        for i in range(0, n):
            if nums[i] == pivot:
                ans[idx] = nums[i]
                idx += 1
        
        for i in range(0, n):
            if nums[i] > pivot:
                ans[idx] = nums[i]
                idx += 1

        return ans
