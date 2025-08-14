class Solution:
    def isValid(self, s: str) -> bool:
        
        n = len(s)

        if n % 2 != 0:
            return False
        
        stack = []

        if s[0] == ')' or s[0] == '}' or s[0] == ']':
            return False
        else:
            for i in range(0, n):
                if s[i] == '(' or s[i] == '{' or s[i] == '[':
                    stack.append(s[i])
                else:
                    if not stack:  # No opening bracket to match
                        return False
                    
                    top = stack[-1]

                    if s[i] == ')' and top == '(' or s[i] == '}' and top == '{' or s[i] == ']' and top == '[':
                        stack.pop()
                    else:
                        return False
                        
        return len(stack) == 0
