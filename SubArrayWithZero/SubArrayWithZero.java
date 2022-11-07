package SubArrayWithZero;

public class SubArrayWithZero {
    public static void subarraywith(int number[]) {
        for (int i = 0; i < number.length - 1; i++) {
            int count = 0;
            // consider all subarrays ending at j
            for (int j = i + 1; j < number.length; j++) {
                // sum of element so far
                count += number[j];

                // if the cont is seen before, we have found a subarray with zero sum
                if (count == 0) {
                    System.out.println("Subarray [" + i + "..." + j + "]");
                    System.out.println("Subarray [" + number[i] + "..." + number[j] + "]");
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        int number[] = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        subarraywith(number);
    }
}
