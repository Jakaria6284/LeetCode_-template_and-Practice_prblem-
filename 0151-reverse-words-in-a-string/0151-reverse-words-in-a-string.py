class Solution:
    def reverseWords(self, s: str) -> str:
        #Solution number 1
        # word=s.split()
        # word.reverse()
        # result=' '.join(word)
        # return result

        #Lets explore solution number 2
        res=[]
        temp=""
        for c in s:
            if c!=" ":
                temp+=c
            elif temp!="":
                res.append(temp)
                temp=""
        if temp!="":
            res.append(temp)

        return " ".join(res[::-1])
        