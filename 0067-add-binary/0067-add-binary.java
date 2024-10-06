class Solution {
    public String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;  // Start with the carry

            if (i >= 0) {
                sum += a.charAt(i) - '0';  // Add the bit from string a
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';  // Add the bit from string b
                j--;
            }

            result.append(sum % 2);  // Append the result of sum % 2 (0 or 1)
            carry = sum / 2;  // Update the carry for the next iteration
        }

        // Reverse the result and convert it back to a string
        return result.reverse().toString();
    }
}