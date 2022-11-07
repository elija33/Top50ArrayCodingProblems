# Top50ArrayCodingProblems

                                    Sort binary array in linear time

Given a binary array, sort it in linear time and constant space. The output should print all zeroes, followed by all ones.

For example,
Input:  { 1, 0, 1, 0, 1, 0, 0, 1 }
Output: { 0, 0, 0, 0, 1, 1, 1, 1 }

                                            Practice This Problem

A simple solution would be to count the total number of 0’s present in the array, say k, and fill the first k indices in the array by 0 and all remaining indices by 1. Alternatively, we can count the total number of 1’s present in the array k and fill the last k indices in the array by 1 and all remaining indices by 0.
