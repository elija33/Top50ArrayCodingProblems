package FirstDuplicateValue.BestFirstDuplicateValue;

import java.util.HashSet;
import java.util.Set;

public class BestFirstDuplicate {
    public static int firstduplicate(int number[]) {
        Set<Integer> numbers = new HashSet<>();
        for (int num : number) {
            if (!numbers.add(num)) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 2, 1, 5, 2, 3, 3, 4 };
        System.out.println(firstduplicate(number));
    }
}
