class Solution:
    def checkIfCanBreak(self, s1: str, s2: str) -> bool:
        more=0
        less=0
        s1_list=sorted(s1)
        s2_list=sorted(s2)

        for i in range(len(s1_list)):
            if s1_list[i]>=s2_list[i]:
                more+=1
            if s1_list[i]<=s2_list[i]:
                less+=1

        if more == len(s1_list) or less == len(s1_list):
            return True

        return False

        