class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        r = len(s) - 1
        l = 0
        while l < r:
            while l < len(s) and not ((ord(s[l]) > 64 and ord(s[l]) < 91) or (ord(s[l]) > 96 and ord(s[l]) < 123) or (ord(s[l]) > 47 and ord(s[l]) < 58)):
                l += 1
            while r > -1 and not ((ord(s[r]) > 64 and ord(s[r]) < 91) or (ord(s[r]) > 96 and ord(s[r]) < 123) or (ord(s[r]) > 47 and ord(s[r]) < 58)):
                r -= 1
            if l == len(s) or r == -1:
                return True
            
            if s[l] != s[r]:
                return False
            l += 1
            r -= 1
        return True