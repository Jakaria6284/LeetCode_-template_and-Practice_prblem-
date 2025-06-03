class Solution:
    def numberOfSubarrays(self, nums: List[int], k: int) -> int:
        
        nums = [1 if num % 2 == 1 else 0 for num in nums]
        
        def atmost(nums, k) -> int:
            count = 0
            left = 0
            sum_ = 0

            for right in range(len(nums)):
                k -= nums[right]
                while k < 0:
                    k += nums[left]
                    left += 1
                count += (right - left + 1)
            return count

        return atmost(nums, k) - atmost(nums, k - 1)
