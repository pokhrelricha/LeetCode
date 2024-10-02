class Solution {
    public int removeElement(int[] nums, int val) {
       int j = 0; // Pointer to place the next non-val element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i]; // Move the non-val element to position j
                j++;
            }
        }
        return j;
    }
}