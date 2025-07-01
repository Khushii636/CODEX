/*28. Find the Index of the First Occurrence in a String
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 
Constraints:
1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.*/

class Solution {
    public int strStr(String haystack, String needle) {
        char ch = needle.charAt(0);
        int l = needle.length();
        for (int i = 0; i <= haystack.length() - l; i++) {
            if (haystack.charAt(i) == ch && check(haystack, needle, i, l))
                return i;
        }
        return -1;
    }

    public boolean check(String s1, String s2, int i, int l) {
        if (s1.substring(i, i + l).equals(s2))
            return true;
        else
            return false;
    }
}
