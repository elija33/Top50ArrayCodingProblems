package CheckNDoubleExist;

public class CheckDoubleExist {
    public static boolean checkDouble(int number[]) {
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (i != j) {
                    if (number[i] == 2 * number[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number[] = { 0, 0 };
        System.out.println(checkDouble(number));
    }
}
