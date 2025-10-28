class Solution:
    def search(self, nums: List[int], target: int) -> int:

        start=0
        end=len(nums)-1

        while start<=end:
            m=(start+end)/2
            mid=int(m)

            if nums[mid]==target:
                return mid
            elif  nums[mid]<target:
                start=mid+1
            else:
                end=mid-1
        return -1



        