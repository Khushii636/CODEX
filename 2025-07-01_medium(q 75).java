/* 75. Sort Colors
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.

Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]
*/

class Solution {
    public void sortColors(int[] nums) {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                a++;
            else if (nums[i] == 1)
                b++;
            else
                c++;
        }
        int k = 0;
        while (k < a) {
            nums[k++] = 0;
        }
        while (k < a + b) {
            nums[k++] = 1;
        }
        while (k < a + b + c) {
            nums[k++] = 2;
        }

    }
}
