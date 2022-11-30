package CheckingSortedArray.EfficientCheckSortedArray;

public class EfficientChecking {
    public static boolean efficientchecking(int number[]) {
        for (int i = 1; i < number.length; i++) {
            if (number[i] < number[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number[] = { 8, 12, 20, 15 };
        System.out.println(efficientchecking(number));
    }
}
