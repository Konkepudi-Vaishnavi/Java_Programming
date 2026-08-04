class Solution:
    def mapWordWeights(self, words: list[str], weights: list[int]) -> str:
        result = ""

        for word in words:
            total = 0

            for ch in word:
                index = ord(ch) - ord('a')
                total += weights[index]

            mod = total % 26
            mapped = chr(ord('z') - mod)

            result += mapped

        return result