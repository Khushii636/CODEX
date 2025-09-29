/*1252. Cells with Odd Values in a Matrix
There is an m x n matrix that is initialized to all 0 's. There is also a 2D array indices where each indices [i] = [ri, c₁] represents a 0-indexed location to perform some increment operations on the matrix.
For each location
indices [i]
do both of the following:
1. Increment all the cells on row
2. Increment all the cells on column
Ci.
Given m, n, and indices, return the number of odd-valued cells
in the matrix after applying the increment to all locations in indices.
 */

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int [][] ans=new int[m][n];
        for(int i=0;i<indices.length;i++)
        {
            int row=indices[i][0];
            int col=indices[i][1];
            for(int j=0;j<n;j++)
            {
            ans[row][j]++;
            }
            for(int k=0;k<m;k++)
            {
            ans[k][col]++;
            }
        }
        int count=0;
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(ans[i][j]%2 != 0)
            count++;
        }
    }
    return count;
    }
}