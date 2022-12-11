package MeanandMedianArray;

import java.util.Arrays;

public class MeanandMedian {
    public static int median(int number[]) {

        // loop thought the array to the end. and dived by 2.
        // if the array is even number, add the milder two number and dive it by 2.
        // if the array is odd right the mild number.

        Arrays.sort(number);
        if (number.length / 2 != 0) {
            return number[number.length / 2];
        } else {
            return (number[number.length / 2 - 1] + number[number.length / 2]) / 2;
        }
    }

    public static int mean(int numbers[]) {
        // Add all the elements in the arrays and dived by the length of the array
        if (numbers == null) {
            return -1;
        }
        int sumup = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumup += numbers[i];
        }
        return sumup / numbers.length;

    }

    public static void main(String[] args) {
        int number[] = { 2, 8, 3, 4 };
        System.out.println("The mean is : " + " " + mean(number));
        System.out.println("The median is : " + " " + median(number));
    }
}
