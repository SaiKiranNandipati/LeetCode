class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        long res = (long) Math.floor(dividend / divisor);
        int max_val = (int) (Math.pow(2, 31) - 1);
        int min_val = (int) -Math.pow(2, 31);
        // Handle overflow case

        if (res > max_val) {
            return max_val;
        } else if (res < min_val) {
            return min_val;
        } else {
            return (int) res;
        }

    }
}