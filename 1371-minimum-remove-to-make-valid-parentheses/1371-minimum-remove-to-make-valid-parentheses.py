class Solution:
    def minRemoveToMakeValid(self, s: str) -> str:
        count = 0
        result = []

        # First pass: remove extra ')'
        for c in s:
            if c == '(':
                result.append(c)
                count += 1
            elif c == ')' and count > 0:
                result.append(c)
                count -= 1
            elif c != ')':
                result.append(c)

        filtered = []

        # Second pass: remove extra '('
        for f in result[::-1]:
            if f == '(' and count > 0:
                count -= 1  # skip this '('
            else:
                filtered.append(f)

        # Reverse back and return
        return "".join(filtered[::-1])
