class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hm = dict()

        for a in strs:
            b = [0] * 26
            for c in a:
                b[ord(c) - 98] += 1
            if tuple(b) not in hm:
                hm[tuple(b)] = []
            hm[tuple(b)].append(a)

        return list(hm.values())