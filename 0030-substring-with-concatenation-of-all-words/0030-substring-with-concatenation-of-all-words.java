class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
           List<Integer> result = new ArrayList<>();

        if (s == null || words == null || words.length == 0) {
            return result;
        }

        int wordLen = words[0].length();
        int wordCount = words.length;

        // Create a frequency map of the words
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        // Iterate over all possible starting positions
        for (int i = 0; i < wordLen; i++) {
            int left = i, right = i, count = 0;
            Map<String, Integer> tempMap = new HashMap<>();

            while (right + wordLen <= s.length()) {
                // Get the current word
                String word = s.substring(right, right + wordLen);
                right += wordLen;

                if (wordMap.containsKey(word)) {
                    tempMap.put(word, tempMap.getOrDefault(word, 0) + 1);
                    count++;

                    // If the count exceeds the expected frequency, shrink the window
                    while (tempMap.get(word) > wordMap.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        tempMap.put(leftWord, tempMap.get(leftWord) - 1);
                        count--;
                        left += wordLen;
                    }

                    // If the window matches the total length, add the starting index
                    if (count == wordCount) {
                        result.add(left);
                    }
                } else {
                    // If the word is invalid, reset the window
                    tempMap.clear();
                    count = 0;
                    left = right;
                }
            }
        }

        return result;  
    }
}