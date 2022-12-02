package MonotonicArray;

public class monotonic {
    public static boolean isMonotonic(int array[]) {
        boolean increasing = true;
        boolean decreasing = true;

        if (array.length <= 2) {
            return true;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                increasing = false;
            } else if (array[i] < array[i + 1]) {
                decreasing = false;
            }
        }
        return increasing || decreasing;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 3, 2, 1 };
        System.out.println(isMonotonic(number));
    }
}
