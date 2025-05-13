class Solution:
    def reverseWords(self, s: str) -> str:
        word=s.split()
        word.reverse()
        result=' '.join(word)
        return result
        