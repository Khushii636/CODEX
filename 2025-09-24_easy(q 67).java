/* 67. Add Binary
Given two binary strings a and b, return their sum as a binary string.

Example 1:
Input: a = "11", b = "1"
Output: "100"
Example 2:
Input: a = "1010", b = "1011"
Output: "10101"

Constraints:
1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.*/

class Solution {
    public String addBinary(String a, String b) {
        int al=a.length();
        int bl=b.length();
        if(al > bl) {
            int z = 0;
            while(z < al - bl) {
                b = "0" + b;
                z++;
            }
        } else {
            int z = 0;
            while(z < bl - al) {
                a = "0" + a;
                z++;
            }
        }

        String carry = "0";
        String ans = "";

        for(int i = a.length()- 1; i >= 0; i--) {  // <-- iterate from right to left
            if(carry.equals("0")) {
                if(a.charAt(i) == '1' && b.charAt(i) == '1') {
                    ans = "0" + ans;
                    carry = "1";
                } else if(a.charAt(i) == '0' && b.charAt(i) == '0') {
                    ans = "0" + ans;
                    carry = "0";
                } else {
                    ans = "1" + ans;
                    carry = "0"; 
                }
            } else {
                if(a.charAt(i) == '1' && b.charAt(i) == '1') {
                    ans = "1" + ans;
                    carry = "1";
                } else if(a.charAt(i) == '0' && b.charAt(i) == '0') {
                    ans = "1" + ans;
                    carry = "0";
                } else {
                    ans = "0" + ans;
                    carry = "1"; 
                }
            }
        }

        if(carry.equals("1")) {
            ans = "1" + ans;
        }

        return ans;
    }
}
