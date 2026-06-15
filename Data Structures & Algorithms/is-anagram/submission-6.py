class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        count1 = [0] * 26 # 26 char length
        count2 = [0] * 26
        for l in s:
            count1[ord(l.lower()) - 97]+=1
        
        for l in t:
            count2[ord(l.lower()) - 97]+=1
        
        for i in range(26):
            if count1[i] != count2[i]:
                return False

        return True