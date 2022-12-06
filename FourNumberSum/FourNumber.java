package FourNumberSum;

public class FourNumber {
    public static int FourNumbers(int number[], int targetSum) {
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    for (int x = k + 1; x < number.length; x++) {
                        if (number[i] + number[j] + number[k] + number[x] == targetSum) {
                         return x;
                        }
                    }
                }
            }
        }
        return targetSum;
        }

    public static void main(String[] args) {
        int number[] = { 7, 6, 4, -1, 1, 2 };
        System.out.println(FourNumbers(number));
    }
}