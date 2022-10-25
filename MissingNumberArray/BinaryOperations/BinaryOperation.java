package MissingNumberArray.BinaryOperations;

import java.lang.annotation.Retention;

public class BinaryOperation {
    public static int getBinary(int number[]) {
        int num1 = number[0];
        int num2 = 1;

        for (int i = 1; i < number.length; i++) {
            num1 = num1 ^ number[i];
        }

        for (int i = 2; i <= number.length + 1; i++) {
            num2 = num2 ^ i;
        }
        return (num1 ^ num2);
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5, 7 };
        System.out.println(getBinary(number));
    }
}
