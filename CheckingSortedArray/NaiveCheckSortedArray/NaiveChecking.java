package CheckingSortedArray.NaiveCheckSortedArray;

public class NaiveChecking {
    public static boolean sortedOrNot(int number[]) {
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[j] < number[i]) {
                    return false;
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number[] = { 8, 12, 20, 15 };
        System.out.println(sortedOrNot(number));
    }
}
