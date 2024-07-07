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

// class Solution {
//     public int divide(int dividend, int divisor) {
//         // Handle division by zero
//         if (divisor == 0) {
//             throw new ArithmeticException("Division by zero");
//         }

//         // Handle overflow case
//         if (dividend == Integer.MIN_VALUE && divisor == -1) {
//             return Integer.MAX_VALUE;
//         }

//         // Convert to long to avoid overflow during division
//         long longDividend = (long) dividend;
//         long longDivisor = (long) divisor;

//         // Perform the division
//         long result = longDividend / longDivisor;

//         // Handle the bounds of 32-bit signed integer
//         int max_val = Integer.MAX_VALUE;
//         int min_val = Integer.MIN_VALUE;
//         if (result > max_val) {
//             return max_val;
//         } else if (result < min_val) {
//             return min_val;
//         } else {
//             return (int) result;
//         }
//     }
// }
