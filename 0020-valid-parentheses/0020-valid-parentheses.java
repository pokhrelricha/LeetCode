class Solution {
    public boolean isValid(String s) {
        // Stack to hold opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate over the characters in the string
        for (char c : s.toCharArray()) {
            // Push the opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // If stack is empty or doesn't match the corresponding opening bracket, return
                // false
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack is empty after processing all characters, the string is valid
        return stack.isEmpty();
    }
}