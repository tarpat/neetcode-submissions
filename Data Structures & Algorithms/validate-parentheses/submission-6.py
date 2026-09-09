class Solution:
    def isValid(self, s: str) -> bool:
        q = []
        for c in s:
            if c == "[" or c == "{" or c == "(":
                q.append(c)
            else:
                if len(q) == 0:
                    return False
                last = q.pop()

                if c == "]":
                    if last != "[":
                        return False
                elif c == "}":
                    if last != "{":
                        return False
                else:
                    if last != "(":
                        return False
        return len(q) == 0