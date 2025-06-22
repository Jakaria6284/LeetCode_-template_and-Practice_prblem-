class Solution:
    def numSubarrayBoundedMax(self, nums: List[int], left: int, right: int) -> int:
        ans = 0
        currentWindow = 0
        l = 0

        for r in range(len(nums)):
            if left <= nums[r] <= right:
                currentWindow = r - l + 1
                ans += currentWindow
            elif nums[r] > right:
                currentWindow = 0
                l = r + 1
            else:
                ans += currentWindow  

        return ans
