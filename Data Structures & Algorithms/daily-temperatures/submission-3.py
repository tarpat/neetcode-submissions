class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        stack = []
        res = [0] * len(temperatures)
        for i, temp in enumerate(temperatures):
            if len(stack) > 0:
                elm = stack.pop()
                if temp > elm[0]:
                    res[elm[1]] = i - elm[1]
                    if len(stack) > 0:
                        while len(stack) > 0 and temp > elm[0]:
                            elm = stack.pop()
                            if temp > elm[0]:
                                res[elm[1]] = i - elm[1]
                            else:
                                stack.append(elm)
                else:
                    stack.append(elm)
                
            stack.append([temp, i])
        return res