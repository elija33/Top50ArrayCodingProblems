package LongestPeak;

public class LongestPeakNumber {
    public static int longestPeak(int array[]) {
        if (array.length == 0) {
            return 0;
        }

        int minusCount = 0;
        int plusCount = 0;
        int maxLength = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int current = array[i];
            int next = array[i + 1];
            int diff = current - next;

            if (diff < 0) {
                if (plusCount == 0) {
                    minusCount++;
                } else {
                    plusCount = 0;
                }
            } else if (diff > 0) {
                if (minusCount > 0) {
                    plusCount++;
                }
            } else if (diff == 0) {
                minusCount = 0;
                plusCount = 0;
            }

            if (minusCount > 0 && plusCount > 0 && (minusCount + plusCount + 1 > maxLength)) {
                maxLength = minusCount + plusCount + 1;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3 };
        System.out.println(longestPeak(number));
    }
}
