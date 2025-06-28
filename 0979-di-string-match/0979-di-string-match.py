class Solution:
    def diStringMatch(self, s: str) -> List[int]:
        ei=0
        d=len(s)
        res=[]

        for i in range(0,len(s)):
            if s[i]=='I':
                res.append(ei)
                ei+=1
                
            else:
                res.append(d)
                d-=1
        res.append(d)
        return res

        