class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        alpha1 = [0] * 26
        alpha2 = [0] * 26
        
        for c in s.lower():
            alpha1[ord(c) - 98] += 1
        for c in t.lower():
            alpha2[ord(c) - 98] += 1
        
        for i in range(26):
            if alpha1[i] != alpha2[i]:
                return False
        
        return True