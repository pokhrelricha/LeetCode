class Solution {
    public int myAtoi(String s) {
      long finalOut = 0;
        int flag = 1;
        int i = 0;
    
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i >= s.length()) return 0;

        if (s.charAt(i) == '-') {
            flag = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            //subtract from character '0' to convert ASCII character into
            //corresponding integer
            finalOut = (finalOut * 10) + (s.charAt(i) - '0');
            if (finalOut > Integer.MAX_VALUE) {
                if (flag == 1) {
                    return Integer.MAX_VALUE;
                }
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) finalOut * flag;
    }
}