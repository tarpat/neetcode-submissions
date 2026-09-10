class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) == 0:
            return 0

        r = 0
        l = 0
        best = 1
        mp = {}
        while r < len(s):
            if s[r] in mp:
                l = max(mp[s[r]] + 1, l)

            mp[s[r]] = r
            best = max(best, r - l + 1)
            r += 1
                

        return best