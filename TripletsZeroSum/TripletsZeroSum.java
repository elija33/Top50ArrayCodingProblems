package TripletsZeroSum;

public class TripletsZeroSum {
    public static int TripletsZeroSum(int number[]) {
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        System.out.println(number[i] + " " + number[j] + " " + number[k]);
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 5, 6, 8, 9, 7, 20, 10, -6 };
        System.out.println(TripletsZeroSum(number));
    }
}
