package MissingNumberArray;

public class MissingNumberArray {
    public static int getMissingNumber(int number[]) {
        int sum = ((number.length + 1) * (number.length + 2)) / 2;
        for (int i = 0; i < number.length; i++)
            sum -= number[i];
        return sum;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 5 };
        System.out.println(getMissingNumber(number));
    }
}
