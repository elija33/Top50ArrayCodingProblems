package SortBinaryArray;

import java.util.Arrays;

public class SortBinaryArray {
    public static void BinaryArray(int number[]) {
        // create a valuable to count all the 0's
        int count = 0;

        // count all 0's
        for (int totalcount : number) {

            // check if the array totalcount is equal to 0, increments count
            if (totalcount == 0) {
                count++;
            }
        }
        // put 0's at the beginning
        int movezeros = 0;
        while (count-- != 0) {
            number[movezeros++] = 0;
        }

        // fill all remaining elements by 1
        while (movezeros < number.length) {
            number[movezeros++] = 1;
        }
    }

    public static void main(String[] args) {
        int number[] = { 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1 };
        BinaryArray(number);

        System.out.println(Arrays.toString(number));
    }
}
