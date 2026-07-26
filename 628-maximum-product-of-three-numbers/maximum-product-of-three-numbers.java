class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MIN_VALUE;
        int m3 = Integer.MIN_VALUE;

        int mi1 = Integer.MAX_VALUE;
        int mi2 = Integer.MAX_VALUE;

        for (int num : nums) {

            if (num > m1) {
                m3 = m2;
                m2 = m1;
                m1 = num;
            } else if (num > m2) {
                m3 = m2;
                m2 = num;
            } else if (num > m3) {
                m3 = num;
            }

            if (num < mi1) {
                mi2 = mi1;
                mi1 = num;
            } else if (num < mi2) {
                mi2 = num;
            }
        }

        return Math.max(m1 * m2 * m3, mi1 * mi2 * m1);
    }
}