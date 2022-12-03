package ArrayOfProducts;

public class ArrayProducts {
    public static int ArrayOfProduct(int number[]) {
        int totalNumber = 1;
        for (int i = 0; i < number.length; i++) {
            totalNumber = totalNumber * number[i];
        }
        return totalNumber;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4 };
        System.out.println(ArrayOfProduct(number));
    }
}
