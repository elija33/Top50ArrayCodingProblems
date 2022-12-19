package SquaresSortedArray;

import java.util.*;

public class Navie {
    public static int[] SquaresSorted(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        int number[] = { -7, -3, 2, 3, 11 };
        System.out.println(SquaresSorted(number));
    }
}