class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) == 0:
            return 0

        r = 0
        l = 0
        best = 1
        seen = set()
        while r < len(s):
            while s[r] in seen and r != l:
                seen.remove(s[l])
                l += 1
            best = max(r - l + 1, best)
            # print(l, r, r - l + 1, best)
            seen.add(s[r])
            r += 1
        
        return best