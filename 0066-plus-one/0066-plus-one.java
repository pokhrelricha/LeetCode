class Solution {
    public int[] plusOne(int[] digits) {
         // Traverse the array from the last digit (rightmost side)
        for (int i = digits.length - 1; i >= 0; i--) {
            // Increment the current digit
            digits[i]++;
            
            // If no carry is needed, return the updated array
            if (digits[i] < 10) {
                return digits;
            }
            
            // If a carry is needed, set the current digit to 0
            digits[i] = 0;
        }

        // If all digits are 0 after processing, we need to add a 1 at the start
        int[] result = new int[digits.length + 1];
        result[0] = 1; // Set the first digit to 1, the rest will be default zeros
        return result;
    }
}