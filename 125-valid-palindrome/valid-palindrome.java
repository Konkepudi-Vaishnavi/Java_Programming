class Solution {
    public boolean isPalindrome(String s) {
        String a = "";

        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));

            if (Character.isLetterOrDigit(c)) {
                a = a + c;
            }
        }

        int l = 0;
        int r = a.length() - 1;

        while (l < r) {
            if (a.charAt(l) != a.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}