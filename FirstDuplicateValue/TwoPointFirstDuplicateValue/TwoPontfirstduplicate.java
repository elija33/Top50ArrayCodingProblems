package FirstDuplicateValue.TwoPointFirstDuplicateValue;

public class TwoPontfirstduplicate {
    public static int arrayDeplicate(int number[]) {
        // [2, 1, 5, 3, 3, 4]
        int start = 0;
        int end = number.length - 1;
        while (start < end) {
            if (number[start] == number[end]) {
                return number[start];
            } else if (number[start] != number[end]) {
                end--;
            } else {
                start++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 2, 1, 5, 2, 3, 3, 4 };
        System.out.println(arrayDeplicate(number));
    }
}
