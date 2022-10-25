package MissingNumberArray.ModificationOverflow;

public class Overflow {
    public static int getMissing(int number[]) {
        int total = 1;
        for (int i = 2; i <= (number.length + 1); i++) {
            total += i;
            total -= number[i - 2];
        }
        return total;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 5 };
        System.out.println(getMissing(number));
    }
}
