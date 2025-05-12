class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        k = n - 2
        l = n - 1

        
        while k >= 0 and nums[k] >= nums[k + 1]:
            k -= 1
        
        if k == -1:
            self.reverse(nums, 0, n - 1)
            return

       
        while l > k and nums[l] <= nums[k]:
            l -= 1

        self.swap(nums, k, l)
        self.reverse(nums, k + 1, n - 1)

    def swap(self, nums, i, j):
        nums[i], nums[j] = nums[j], nums[i]

    def reverse(self, nums, start, end):
        while start < end:
            self.swap(nums, start, end)
            start += 1
            end -= 1
