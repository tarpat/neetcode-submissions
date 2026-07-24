class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = []
        for string in strs:
            a = [0] * 26
            for c in string:
                a[ord(c) - 98] += 1

            anagrams.append(a)

        u_anagrams = []
        for anagram in anagrams:
            if anagram not in u_anagrams:
                u_anagrams.append(anagram)
        
        final_list = []
        for u_anagram in u_anagrams:
            b = []
            for i, anagram in enumerate(anagrams):
                if anagram == u_anagram:
                    b.append(strs[i])
            final_list.append(b)

        return final_list