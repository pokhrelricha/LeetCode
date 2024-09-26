class Solution {
    public String longestCommonPrefix(String[] strs) {
          if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Start with the first string in the array as the prefix to compare with others
        String prefix = strs[0];
        
        for (int i = 1; i < strs.length; i++) {
            // Compare the current prefix with each string in the array
            while (strs[i].indexOf(prefix) != 0) {
                // Reduce the prefix until it matches the beginning of the string
                prefix = prefix.substring(0, prefix.length() - 1);
                // If the prefix becomes empty, return an empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }       
}