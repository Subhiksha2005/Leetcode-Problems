class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        StringBuilder str = new StringBuilder();
        int c = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                str.append(Character.toLowerCase(ch));
                c++;
            }
        }

        for (int i = 0, j = c - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}

