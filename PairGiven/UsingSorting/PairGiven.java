package PairGiven.UsingSorting;

import java.util.Arrays;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class PairGiven {
    public static void pairgiven(int number[], int target) {
        // Sort the array out
        Arrays.sort(number);

        // Start from the bring and the end of the array
        int start = 0;
        int end = number.length - 1;

        // Compair the start and the end
        while (start < end) {
            // if the start + end is equal to the target print out start and end.
            if (number[start] + number[end] == target) {
                System.out.printf("The Pair is (%d, %d)", number[start], number[end]);
                return;
            } else if (number[start] + number[end] < target) {
                start++;
            } else {
                end--;
            }
            System.out.println("The Pair is not found");
        }
    }

    public static void main(String[] args) {
        int target = 10;
        int number[] = { 8, 7, 2, 5, 3, 1 };
        pairgiven(number, target);
    }
}
