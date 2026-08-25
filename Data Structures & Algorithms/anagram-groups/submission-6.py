class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        char_counts = dict()
        for string in strs:
            freq = [0] * 26
            for c in string.lower():
                freq[ord(c) - 97] += 1

            if tuple(freq) not in char_counts:
                char_counts[tuple(freq)] = []
            char_counts[tuple(freq)].append(string)

            # if tuple(freq) in char_counts:
            #     char_counts[tuple(freq)].append(string)
            # else:
            #     char_counts[tuple(freq)] = [string]
        
        return list(char_counts.values())