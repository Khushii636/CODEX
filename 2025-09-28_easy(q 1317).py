#1317. Convert Integer to the Sum of Two No-Zero Integers

#No-Zero integer is a positive integer that does not contain any 0 in its decimal representation.
#Given an integer n, return a list of two integers [a, b]
#where:
#a and b are No-Zero integers.
#The test cases are generated so that there is at least one valid solution. If there are many valid solutions, you can return any of them.
#Example 1:
#Input: n = 2
#Output: [1,1]
#Explanation: Let a = 1 and b = 1.
#Both a and b are no-zero integers, and a + = 2 = n.


class Solution(object):
    def getNoZeroIntegers(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        l=[]
        i=1
        for i in range(1,(n/2)+1):
            if  '0' not in str(i) :
                j=n-i
                if '0' not in str(j):
                    l=[i,j]
                    break
        return l
        