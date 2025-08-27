class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        stack=[]
        mapp={}
        result=[]
        for i in range(len(nums2)):
            while stack and nums2[i]>stack[-1]:
                mapp[stack.pop()]=nums2[i]
            stack.append(nums2[i])
        
        while stack:
            mapp[stack.pop()]=-1
        
        for i in range(len(nums1)):
            result.append(mapp[nums1[i]])
            

        
        print(result)

        return result


        