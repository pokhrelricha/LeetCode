class Solution {
    public int climbStairs(int n) {
         // Handle base cases
        if (n == 1) return 1;

        // Initialize base cases
        int prev2 = 1; // dp[0]
        int prev1 = 1; // dp[1]

        for (int i = 2; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}