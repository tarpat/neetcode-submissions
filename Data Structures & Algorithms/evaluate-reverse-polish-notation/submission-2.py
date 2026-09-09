class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []
        for token in tokens:
            if token not in ('+', '-', '*', '/'):
                stack.append(token)
            else:
                a = stack.pop()
                b = stack.pop()
                if token == '+':
                    stack.append(int(b) + int(a))
                if token == '-':
                    stack.append(int(b) - int(a))
                if token == '*':
                    stack.append(int(b) * int(a))
                if token == '/':
                    stack.append(int(b) / int(a))
        return int(stack.pop())