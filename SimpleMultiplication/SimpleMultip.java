package SimpleMultiplication;

public class SimpleMultip {
    public static int simpleMultip(int number) {
        if (number % 2 == 0) {
            return number * 8;
        }
        return number * 9;
    }

    public static void main(String[] args) {
        int number = 2;
        System.out.println(simpleMultip(number));
    }
}
