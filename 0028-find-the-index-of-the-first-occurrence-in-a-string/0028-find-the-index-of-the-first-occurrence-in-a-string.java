class Solution {
    public int strStr(String haystack, String needle) {
      // Edge case: if needle is empty, return 0
        if (needle.length() == 0) {
            return 0;
        }

        int j = 0; // Pointer for needle
        int i = 0; // Pointer for haystack

        // Loop through the haystack
        while (i < haystack.length()) {
            // If characters match, move needle pointer forward
            if (needle.charAt(j) == haystack.charAt(i)) {
                j++;
                // If we found the whole needle in haystack, return the starting index
                if (j == needle.length()) {
                    return i - needle.length() + 1;
                }
            } else {
                // If there was a mismatch, reset j and adjust i
                i = i - j;  // Go back by the number of matched characters
                j = 0;      // Reset needle pointer
            }
            i++;  // Move haystack pointer forward
        }

        return -1; // No match found
    }
}