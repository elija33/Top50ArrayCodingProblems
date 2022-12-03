package ArrayOfProducts.EfficiSolution;

public class ArrayProducts {
    public int[] productsarray(int number[]) {
        int right[] = new int[number.length];
        int left[] = new int[number.length];
        int rightleft[] = new int[number.length];

        left[0] = 1;
        right[number.length - 1] = 1;

        for (int i = 0; i < number.length; i++) {
            left[i] = number[i - 1] * left[i - 1];
        }

        for (int i = number.length - 2; i >= 0; i--) {
            right[i] = number[i + 1] * right[i + 1];
        }

        for (int i = 0; i < number.length; i++) {
            rightleft[i] = left[i] * right[i];
        }
        return rightleft;
    }

    public static void main(String[] args) {
        int number[] = { 1, 8, 6, 2, 4 };
        System.out.println();
    }
}
