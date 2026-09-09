class Solution:
    def isValid(self, s: str) -> bool:
        q = []
        for c in s:
            if c == "[" or c == "{" or c == "(":
                q.append(c)
            elif c == "]":
                if len(q) == 0:
                    return False
                last = q.pop()
                if last != "[":
                    return False

            elif c == "}":
                if len(q) == 0:
                    return False
                last = q.pop()
                if last != "{":
                    return False
                
            elif c == ")":
                if len(q) == 0:
                    return False
                last = q.pop()
                if last != "(":
                    return False
        return len(q) == 0