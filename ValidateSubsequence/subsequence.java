package ValidateSubsequence;

import java.util.List;

public class subsequence {
    public static boolean isValidateSubsequence(List<Integer> number, List<Integer> number1) {
        int pointnumber = 0;
        int pointnumber1 = 0;

        while (pointnumber < number.size() && pointnumber1 < number1.size()) {
            if (number.get(pointnumber) == number1.get(pointnumber1)) {
                pointnumber++;
                pointnumber1++;

                if (pointnumber == pointnumber1) {
                    return true;
                } else {
                    pointnumber = pointnumber - pointnumber1 + 1;
                    pointnumber1 = 0;
                }
            }
        }
        return false;
    }
}
