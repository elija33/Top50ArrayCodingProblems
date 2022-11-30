package LargestElementInArray;

public class LargestNumberArray {
    public static int largestNumber(int number[]) {
        int cout = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > cout) {
                cout = number[i];
            }
        }
        return cout;
    }

    public static void main(String[] args) {
        int number[] = { 10, 5, 20, 8 };
        System.out.println(largestNumber(number));
    }
}
