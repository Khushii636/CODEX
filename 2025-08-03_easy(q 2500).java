/* 2500. Delete Greatest Value in Each Row
You are given an m x n matrix grid consisting of positive integers.
Perform the following operation until grid becomes empty:
Delete the element with the greatest value from each row. If multiple such elements exist, delete any of them.
Add the maximum of deleted elements to the answer.
Note that the number of columns decreases by one after each operation.
Return the answer after performing the operations described above.*/

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int sum=0;
        for(int i=0;i<grid.length;i++)
        {
            Arrays.sort(grid[i]);
        }
        for(int i=0;i<grid[0].length;i++)
        {
           int max=0;
           for(int j=0;j<grid.length;j++)
           {
            if(grid[j][i]>max)
            max=grid[j][i];
           }
           sum+=max;
        }
        return sum;
    }
}
