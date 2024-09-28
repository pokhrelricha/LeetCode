class Solution {
    public int removeDuplicates(int[] nums) {
        // Edge case: If the array has only one element, it's already unique
        if (nums.length == 0) {
            return 0;
        }

        // Initialize the first pointer to track the position of the unique elements
        int i = 0;

        // Iterate through the array with the second pointer
        for (int j = 1; j < nums.length; j++) {
            // When a new unique element is found, move the first pointer and update the
            // value
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        // The number of unique elements is i + 1
        return i + 1;
    }
}