package DuplicateZeros;

public class DuplicateZeros {
    public void duplicatesZeros(int number[]) {
        // Loop thought the arr looking for Zeros
        // When we find Zeros, we shif the array element to the right one step.
        // Insert 0 next to the Zero we find.
        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] == 0) {
                for (int j = number.length - 1; j > i; j--) {
                    number[j] = number[j - 1];
                }
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int number[] = { 1, 0, 2, 3, 0, 4, 5, 0 };
        System.out.println(number);
    }
}
