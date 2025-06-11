class Solution:
    def maxScore(self, cardPoints: List[int], k: int) -> int:
        total = sum(cardPoints)  # total points of all cards
        maxsum = 0
        summ = 0

        # Initial window of length n - k
        for i in range(0, len(cardPoints) - k):
            summ += cardPoints[i]
        maxsum = total - summ  # max sum after removing that window

        # Slide the window forward
        for i in range(len(cardPoints) - k, len(cardPoints)):
            summ += cardPoints[i]             # add next element to window
            summ -= cardPoints[i - (len(cardPoints) - k)]  # remove first element of previous window
            maxsum = max(maxsum, total - summ)  # update max

        return maxsum
