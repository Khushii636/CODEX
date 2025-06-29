/* 5. Longest Palindromic Substring
Given a string s, return the longest palindromic substring in s.

Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:
Input: s = "cbbd"
Output: "bb"
 
Constraints:
1 <= s.length <= 1000
s consist of only digits and English letters.
 */

class Solution {
    public String longestPalindrome(String str) {
        boolean check = true;
        String sub = "";
        String finalsub = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length() - 1; j > i; j--) {
                if (str.charAt(i) == str.charAt(j)) {
                    sub = str.substring(i, j + 1);

                    if (finalsub.length() < sub.length()) {
                        finalsub = palindrome(sub, finalsub);
                    }
                }
            }
        }

        if (finalsub.equals(""))
            finalsub += str.charAt(0);

        return finalsub;
    }

    public String palindrome(String s, String ns) {
        for (int i = 0, j = s.length() - 1; j > i; i++, j--) {
            if (s.charAt(i) != s.charAt(j))
                return ns;
        }
        return s;
    }
}
