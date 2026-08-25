class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        c1 = [0] * 26
        c2 = [0] * 26
        for letter in s.lower():
            c1[ord(letter) - 97] += 1
        
        for letter in t.lower():
            c2[ord(letter) - 97] += 1
        
        return c1 == c2