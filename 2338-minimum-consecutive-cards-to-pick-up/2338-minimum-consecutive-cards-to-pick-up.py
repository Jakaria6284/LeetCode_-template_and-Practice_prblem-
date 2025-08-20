class Solution:
    def minimumCardPickup(self, cards: List[int]) -> int:
        index_map = {}
        ans = float('inf')

        # store indices of each card
        for i in range(len(cards)):
            if cards[i] not in index_map:
                index_map[cards[i]] = []
            index_map[cards[i]].append(i)

        # check all consecutive indices
        for indices in index_map.values():
            if len(indices) >= 2:
                for j in range(1, len(indices)):
                    ans = min(ans, indices[j] - indices[j-1] + 1)

        return -1 if ans == float('inf') else ans
