from typing import List

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        majority_track = {}
        n = len(nums)

        for num in nums:
            majority_track[num] = majority_track.get(num, 0) + 1

        for k, v in majority_track.items():
            if v > n // 2:  
                return k
