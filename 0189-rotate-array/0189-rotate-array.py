from typing import List

class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        n = len(nums)
        k = k % n 
        if k == 0:
            return
        lasthalf = n - k

        ans = [0] * n
        idx = 0

        for i in range(lasthalf, n):
            ans[idx] = nums[i]
            idx += 1

        for i in range(0, lasthalf):
            ans[idx] = nums[i]
            idx += 1

        for i in range(n):
            nums[i] = ans[i]
