package FirstDuplicateValue.TwoPointFirstDuplicateValue;

public class TwoPontfirstduplicate {
    public static int arrayDeplicate(int number[]) {
        // [2, 1, 5, 3, 3, 4]
        int start = 0;
        int end = number.length - 1;
        while (start < end) {
            System.out.println(start + " " + end);
            if (number[start] == number[end]) {
                return number[start];
            }
            end--;
            if (start == end) {
                end = number.length - 1;
                start++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 2, 1, 3, 6, 8, 3, 4 };
        System.out.println(arrayDeplicate(number));
    }
}

// { 2, 1, 5, 6, 3, 3, 4 };
// s e