package MaxConsecutiveOne;

public class ConsecutiveOne {
    public static int findMaxConsecutiveOne(int arr[]) {
        int count = 0;
        int reset = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                count++;
            else {
                count = 0;
            }
            reset = Math.max(reset, count);
        }
        return reset;
    }

    public static void main(String[] args) {
        int number[] = { 0, 1, 1, 0, 2, 3, 0, 1, 1, 0, 1, 1, 1, 1 };
        int number1[] = { 1, 0, 1, 1, 0, 1 };
        int number2[] = { 0, 0, 0, 0, 0 };
        System.out.println(findMaxConsecutiveOne(number2));
        System.out.println(findMaxConsecutiveOne(number1));
        System.out.println(findMaxConsecutiveOne(number));
    }
}
