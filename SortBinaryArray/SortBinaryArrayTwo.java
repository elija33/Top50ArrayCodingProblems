package SortBinaryArray;

import java.util.Arrays;

public class SortBinaryArrayTwo {
    public static void sortBinary(int number[]) {

        // count stores index of next available position
        int count = 0;

        // Do for each element
        for (int sum : number) {

            // if the current element is zero, put 0 at the next free
            // position in the array
            if (sum == 0) {
                number[count++] = 0;
            }
        }

        // fill all remaining indices by 1
        for (int i = count; i < number.length; i++) {
            number[count++] = 1;
        }
    }

    public static void main(String[] args) {
        int number[] = { 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
        sortBinary(number);
        System.out.println(Arrays.toString(number));
    }
}
