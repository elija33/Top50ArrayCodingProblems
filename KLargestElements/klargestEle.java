package KLargestElements;

import java.util.Arrays;

public class klargestEle {
    public int[] kLargest(int number[], int givenumber) {
        int count = 0;
        int[] num = new int[givenumber];
        Arrays.sort(number);
        for (int i = number.length - 1; i >= number.length - givenumber; i--) {
            num[count++] = number[i];
        }
        return num;
    }

    public static void main(String[] args) {
        int number[] = { 12, 3, 4, 13, 14, 25, 2, 1 };
        int givenumber = 4;
        System.out.println();
    }
}
