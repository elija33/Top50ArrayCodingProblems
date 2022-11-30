package LargestElementInArray;

import java.util.Arrays;

public class SortingLargestElementInArray {
    public static int SortingLargestArray(int number[]) {
        Arrays.sort(number);
        return number[number.length - 1];
    }

    public static void main(String[] args) {
        int number[] = { 20, 10, 20, 4, 100 };
        System.out.println(SortingLargestArray(number));
    }
}
