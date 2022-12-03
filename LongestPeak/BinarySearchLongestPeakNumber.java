package LongestPeak;

public class BinarySearchLongestPeakNumber {
    public static int peakIndexInMount(int number[]) {
        int start = 0;
        int end = number.length - 1;

        while (start < end) {
            int midpoint = start + (end - start) / 2;
            if (number[midpoint] < number[midpoint + 1]) { // { 1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3 }
                start = midpoint + 1; // m
            } else {
                end = midpoint;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3 };
        System.out.println(peakIndexInMount(number));
    }
}
