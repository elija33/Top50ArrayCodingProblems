package EvenNumberDigits;

public class NumberDigits {
    public static int number(int arr[]) {
        int count = 0;
        // for (int arrs : arr)
        for (int i = 0; i < arr.length; i++) {
            int length = String.valueOf(arr[i]).length();
            if (length % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = { 12, 345, 2, 6, 7896 };
        System.out.println(number(nums));
    }
}
