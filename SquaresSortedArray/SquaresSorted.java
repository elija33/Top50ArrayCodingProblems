package SquaresSortedArray;

import java.util.Arrays;

public class SquaresSorted {
    // loop thought the array,
    //
    public int[] sortedSquare(int arr[]) {
        int right = arr.length - 1;
        int left = 0;
        int ponint = arr.length - 1;
        int arrs[] = new int[arr.length];
        while (left < right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                arrs[ponint] = arr[left] * arr[left];
                left++;
            } else {
                arrs[ponint] = arr[right] * arr[right];
                right--;
            }
            ponint++;
        }
        return arrs;
    }

    public static void main(String[] args) {
        int nums[] = { -7, -3, 2, 3, 11 };

    }
}
