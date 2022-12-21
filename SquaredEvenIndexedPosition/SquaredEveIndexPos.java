package SquaredEvenIndexedPosition;

public class SquaredEveIndexPos {
    public static int[] SquaredEveIndexPos(int number[]) {
        for (int i = 0; i < number.length - 1; i++) {
            if (i % 2 == 0) {
                number[i] *= number[i];
                return number;
            }
        }
        return number;

    }

    public static void main(String[] args) {
        int number[] = { 9, -2, -9, 11, 56, -12, -3 };
    }
}
