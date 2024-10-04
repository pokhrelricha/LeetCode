class Solution {
    public int lengthOfLastWord(String s) {
        String[] stringArray = s.split(" ");
        return stringArray[stringArray.length -1].trim().length();
    }
}