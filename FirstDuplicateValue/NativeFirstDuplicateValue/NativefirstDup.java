package FirstDuplicateValue.NativeFirstDuplicateValue;

import java.util.Arrays;

public class NativefirstDup {
    public static int firstduplicate(int number[]) {
        int minimumidex = number.length;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] == number[j]) {
                    minimumidex++;
                    return minimumidex;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 2, 1, 5, 3, 2, 3, 4 }; // 1,2,2,3,3,4
        System.out.println(firstduplicate(number));
    }
}
