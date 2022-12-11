package MaxandSecondMax;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxSecondMax {
    public static ArrayList<Integer> firstSecondlargersNumber(int arr[]) {
        // Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count < arr[i]) {
                count++;
                return count;
            }
        }
    }

    public static void main(String[] args) {

    }
}
