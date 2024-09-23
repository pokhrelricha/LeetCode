class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        backtrack(result, current, 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder current, int open, int close, int max) {
        // Base case: if the current string has reached the maximum length (2 * n), add
        // it to the result
        if (current.length() == max * 2) {
            result.add(current.toString());
            return;
        }

        // If we can still add an opening parenthesis, do so
        if (open < max) {
            current.append('(');
            backtrack(result, current, open + 1, close, max);
            current.deleteCharAt(current.length() - 1); // Backtrack (remove last added character)
        }

        // If we can still add a closing parenthesis without making the sequence
        // invalid, do so
        if (close < open) {
            current.append(')');
            backtrack(result, current, open, close + 1, max);
            current.deleteCharAt(current.length() - 1); // Backtrack (remove last added character)
        }
    }
}