package PeakElement;

public class NaviePeakElement {
    public static int peakElement(int number[]) {
        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] > number[i + 1]) {
                return i;
            }
        }
        return number[number.length - 1];
    }

    public static void main(String[] args) {
        int[] number = { 2, 3, 1, 4, 7, 5 };
        System.out.println(peakElement(number));
    }
}