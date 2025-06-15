from typing import List

class Solution:
    def numSubarrayProductLessThanK(self, nums: List[int], k: int) -> int:
        return self.sub_array(nums, k)

    def sub_array(self, nums, k):
        n = len(nums)
        count = 0
        l = 0
        r = 0
        mul = 1
        while r < n:
            mul *= nums[r]
            while mul >= k and l <= r:
                mul //= nums[l]  # Fixed logic to use integer division instead of -=
                l += 1
            count += (r - l + 1)
            r += 1
        return count
