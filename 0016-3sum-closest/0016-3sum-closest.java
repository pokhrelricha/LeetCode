class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // Sort the array to enable the two-pointer technique.
        Arrays.sort(nums);
        int n = nums.length;
        int closestSum = Integer.MAX_VALUE / 2; // Initialize to a large value.

        for (int i = 0; i < n - 2; i++) {
            // Avoid duplicate calculations for the same `nums[i]`.
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1, right = n - 1;
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - currentSum) < Math.abs(target - closestSum)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++; // Increase sum by moving the left pointer right.
                } else if (currentSum > target) {
                    right--; // Decrease sum by moving the right pointer left.
                } else {
                    // Exact match found.
                    return currentSum;
                }
            }
        }
        return closestSum;
    }
}