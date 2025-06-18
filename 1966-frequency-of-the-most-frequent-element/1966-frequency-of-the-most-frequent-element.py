class Solution:
    def maxFrequency(self, nums: List[int], k: int) -> int:
        nums.sort()
        left = 0
        total = 0
        maxFreq = 0

        for right in range(len(nums)):
            total += nums[right]

            # While total + k < nums[right] * window size, shrink the window
            while nums[right] * (right - left + 1) - total > k:
                total -= nums[left]
                left += 1

            maxFreq = max(maxFreq, right - left + 1)

        return maxFreq
