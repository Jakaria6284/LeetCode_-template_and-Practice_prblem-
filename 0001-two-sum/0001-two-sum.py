class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mp={}

        for i in range(0,len(nums)):
            compitent=target-nums[i]

            if compitent in mp:
                return [mp[compitent],i]
            else:
                mp[nums[i]]=i
        return [-1,-1]

        