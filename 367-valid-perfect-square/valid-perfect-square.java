class Solution {
    public boolean isPerfectSquare(int n) {
        if (n < 1) {
            return false;
        }
        long l = 1;
        long r = n;

        while (l <= r) {
            long m = l + (r - l) / 2;
            long s = m * m;

            if (s == n) {
                return true;
            } else if (s < n) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return false;
    }
}