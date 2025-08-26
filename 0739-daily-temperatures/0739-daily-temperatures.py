class Solution:
    def dailyTemperatures(self, temperature: List[int]) -> List[int]:

        result=[0]*len(temperature)
        stack=[]

        for i in range(len(temperature)):
            while stack and temperature[i]>temperature[stack[-1]]:
                idx=stack.pop()
                result[idx]=i-idx
            stack.append(i)
        return result


        