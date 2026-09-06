
class Solution {
    public String longestPalindrome(String s) {

        int start = 0;
        int maxLength = 1;
        int end=0;

        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j < s.length(); j++) {

                if (isPalindrome(s, i, j)) {

                    int length = j - i + 1;

                    if (length > maxLength) {
                        maxLength = length;
                        start = i;
                        end=j;
                    }
                }
            }
        }

        return s.substring(start, end+1);
    }

    public boolean isPalindrome(String s, int i, int j) {

        while (i < j) {

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}

