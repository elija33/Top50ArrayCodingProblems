package SmallestDifference;

import java.util.Arrays;

public class SmallestDiff {
    public static int[] smallest(int number[], int numbers[]) {
        Arrays.sort(number);
        Arrays.sort(numbers);

        // create a variable that is the brining of the array
        int startOne = 0;
        int startTwo = 0;

        int smallestNumber = Integer.MAX_VALUE;
        int smallestPair[] = new int[] {};
        while (startOne < number.length && startTwo < numbers.length) {
            int diff = Math.abs(number[startOne] - numbers[startTwo]);
            if (diff == 0) {
                return new int[] { number[startOne], numbers[startTwo] };
            }
            if (diff < smallestNumber) {
                smallestNumber = diff;
                smallestPair = new int[] { number[startOne], numbers[startTwo] };
            }
            if (number[startOne] < numbers[startTwo]) {
                startOne++;
            } else {
                startTwo++;
            }
        }
        return smallestPair;

    }

    public static void main(String[] args) {
        int number[] = { -1, 5, 10, 20, 28, 3 };
        int numbers[] = { 26, 134, 135, 15, 17 };
        System.out.println(smallest(number, numbers));
    }
}
