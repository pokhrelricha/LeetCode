class Solution {
    public int lengthOfLongestSubstring(String s) {
         // HashSet to store the unique characters in the current window
        Set<Character> uniqueChars = new HashSet<>();
        // Two pointers for the sliding window
        int left = 0, right = 0;
        // Variable to keep track of the maximum length of substring found
        int maxLength = 0;

        // Iterate over the string using the right pointer
        while (right < s.length()) {
            // If the character at the right pointer is not in the set, add it
            if (!uniqueChars.contains(s.charAt(right))) {
                uniqueChars.add(s.charAt(right));
                right++;
                // Update the maximum length
                maxLength = Math.max(maxLength, right - left);
            } else {
                // If the character is already in the set, remove the leftmost character
                uniqueChars.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}