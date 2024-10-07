class Solution {
    public int mySqrt(int x) {
       if (x == 0 || x == 1) {
            return x;
        }

        // Initialize the binary search range
        int left = 1, right = x, result = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            // To avoid overflow, use mid <= x / mid instead of mid^2
            if (mid <= x / mid) {
                result = mid;  // mid is a valid candidate
                left = mid + 1;  // Look in the right half
            } else {
                right = mid - 1;  // Look in the left half
            }
        }

        return result;
    }
}