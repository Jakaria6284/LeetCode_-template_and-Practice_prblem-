class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        i = 0
        n = len(asteroids)
        stack = []

        while i < n:
            if not stack:
                stack.append(asteroids[i])
                i += 1
            else:
                # Both positive asteroids
                if stack[-1] >= 0 and asteroids[i] >= 0:
                    stack.append(asteroids[i])
                    i += 1
                
                # Potential collision: one positive, one negative
                elif (stack[-1] >= 0 > asteroids[i]):

                    while stack and stack[-1] >= 0 and abs(stack[-1]) < abs(asteroids[i]):
                        stack.pop()

                    if not stack or stack[-1] < 0:
                        stack.append(asteroids[i])
                        i += 1
                    elif abs(stack[-1]) == abs(asteroids[i]):
                        stack.pop()
                        i += 1
                    else:
                        # Current asteroid destroyed, just move on
                        i += 1

                else:
                    # No collision, just append
                    stack.append(asteroids[i])
                    i += 1
        return stack
