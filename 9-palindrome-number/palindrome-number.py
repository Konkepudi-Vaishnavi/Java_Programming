class Solution:
    def isPalindrome(self, x: int) -> bool:
        rem = 0
        original = x
        rev = 0
        if x < 0:
            return False
        while x > 0:
            rem = x % 10
            rev = rem + (rev * 10)
            x = x // 10
        return original == rev