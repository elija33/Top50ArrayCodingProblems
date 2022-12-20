package MergeSortedArray;

public class MergeSor {
    public void merge(int number[], int number1[], int m, int n) {
        int j = n - 1;
        int i = m - 1;
        int k = n + m - 1;
        while (i >= 0 && j >= 0) {
            if (number[i] > number1[j]) {
                number[k--] = number[i--];
            } else {
                number[k--] = number1[j--];
            }
        }
        while (j >= 0) {
            number[k--] = number1[j--];
        }
    }
}
