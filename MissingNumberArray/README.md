# Top50ArrayCodingProblems
How to find the missing number in integer array of 1 to 100.

Given an integer array which contains numbers from 1 to 100 but one number is missing, you need to write a Java program to find that missing number in an array. You can not use any open source library or Java API method which solves this problem. One trick to solve this problem is to calculat sum of all number in the array and compare with expected sum, the difference would be the missing number.

                                Examples:
Input: list[] = {1, 2, 4, 6, 3, 7, 8, 10, 5}
Output: 9.
Explanation: The missing number from 1 to 10 is 9.

Input: list[] = {3, 2, 4, 5}
Output: 1.
Explanation: The missing number from 1 to 5 is 1.


Method 1: Using summation of first N natural numbers.
    - Calculate the sum of the first N natural numbers as sumtotal = N * (N + 1) / 2.
    -Traverse the array from start to end.
        -Find the sum of all the array elements.
    -Print the missing number as SumTotal - sum of array.

Method 2: Modification for Overflow. The approach remains the same but there can be an overflow if N is large.
    - Create a variable sum = 1 which will store the missing number and a counter variable c = 2.
    - Traverse the array from start to end.
        - Update the value of sum as sum = sum – array[i] + c and increment c by 1. This performs the task mentioned in the above idea]
    - Print the missing number as a sum.

Method 3: Using binary operations:
            This method uses the technique of XOR to solve the problem.
        - Create two variables a = 0 and b = 0
        - Run a loop from i = 1 to N:
            - For every index, update a as a = a ^ i
        - Now traverse the array from i = start to end.
            - For every index, update b as b = b ^ arr[i].
        - The missing number is a ^ b.

