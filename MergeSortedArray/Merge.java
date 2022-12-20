package MergeSortedArray;

public class Merge {
    public void merge(int number[], int number1[], int m, int n) {
        m--;
        n--;
        int numberlength = number.length - 1;
        while (numberlength >= 0) {
            if (m < 0) {
                number[numberlength] = number1[n--];
            } else if (n < 0) {
                number[numberlength] = number[m--];
            } else {
                if (number[m] > number1[n]) {
                    number[numberlength] = number[m--];
                } else {
                    number[numberlength] = number1[n--];
                }
            }
            numberlength--;
        }
    }
}
