class Solution:
    def diStringMatch(self, s: str) -> List[int]:
        perm_of_I=0
        perm_of_D=len(s)
        res=[]
        i=0

        for i in range(len(s)):
            if s[i]=='I':
                res.append(perm_of_I)
                perm_of_I+=1
            else:
                res.append(perm_of_D)
                perm_of_D-=1
                
        res.append(perm_of_I)
            
        return res

        