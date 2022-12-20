package CheckNDoubleExist;

public class CheckDoubleExist {
    public static boolean checkDouble(int number[]) {
        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] == number[i + 1] * number[i + 1 + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number[] = { 3, 1, 7, 11 };
        System.out.println(checkDouble(number));
    }
}
