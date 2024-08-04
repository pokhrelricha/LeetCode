class Solution {
    public int lengthOfLongestSubstring(String s) {
         if (s == null || s.length() == 0) {
            return 0;
        }

        // HashMap to store the latest index of each character
        Map<Character, Integer> charIndexMap = new HashMap<>();
        // Variable to keep track of the maximum length of substring found
        int maxLength = 0;
        // The starting index of the current window
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If the character is found in the map and is within the current window
            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
                // Move the start pointer to the right of the previous occurrence of currentChar
                start = charIndexMap.get(currentChar) + 1;
            }

            // Update the latest index of currentChar
            charIndexMap.put(currentChar, end);
            // Update the maximum length of the substring
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}