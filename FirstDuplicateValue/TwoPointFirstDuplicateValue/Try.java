package FirstDuplicateValue.TwoPointFirstDuplicateValue;

public class Try {
    public static long findRange(int num) {
        String min;
        String max;
        long minnumber;
        long maxnumber;
        max = new Long(num).toString();
        int i = 0;
        while (i < max.length()) {
            if (max.charAt(i) == '1') {
                max = max.replace(max.charAt(i), 9);
            }
            i++;
        }
        min = new Long(num).toString();
        int j = 0;
        while (j < min.length()) {
            if (min.charAt(j) == '2') {
                min = min.replace(min.charAt(i), 0);
            }
            j++;
        }
        maxnumber = new Long(max);
        minnumber = new Long(min);
        return maxnumber - minnumber;
    }
}
