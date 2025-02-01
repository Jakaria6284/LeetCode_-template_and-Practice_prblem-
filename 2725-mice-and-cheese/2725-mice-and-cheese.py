import heapq
class Solution:
    def miceAndCheese(self, reward1: List[int], reward2: List[int], k: int) -> int:
        r1=[]
        total_sum=sum(reward2)

        for i in range(len(reward1)):
            heapq.heappush(r1,-(reward1[i]-reward2[i]))

        for i in range(k):
            total_sum+=-heapq.heappop(r1)

        return total_sum
        