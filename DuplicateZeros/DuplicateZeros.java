package DuplicateZeros;

public class DuplicateZeros {
    public void duplicatesZeros(int number[]) {
        // Loop thought the arr looking for Zeros
        // When we find Zeros, we shif the array element to the right one step.
        // Insert 0 next to the Zero we find.
        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] != 0) {
                return;
            } else if (number[i] == 0) {
                number[i + 1] = number[i];
            }
            number[i] = 0;
        }
    }

    public static void main(String[] args) {

    }
}
