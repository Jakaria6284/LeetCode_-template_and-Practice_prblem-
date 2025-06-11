class Solution:
    def maxScore(self, cardPoints: List[int], k: int) -> int:
        total=sum(cardPoints)
        maxsum=0
        summ=0

        for i in range(0,len(cardPoints)-k):
            summ+=cardPoints[i]
        maxsum=total-summ

        for i in range((len(cardPoints) - k),len(cardPoints)):
            summ+=cardPoints[i]
            summ-=cardPoints[i-(len(cardPoints) - k)]
            maxsum=max(maxsum,total-summ)
        return maxsum
        