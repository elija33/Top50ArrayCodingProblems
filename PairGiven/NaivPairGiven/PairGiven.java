package PairGiven.NaivPairGiven;

public class PairGiven {
    public static void pairgiven(int number[], int target) {
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] + number[j] == target) {
                    System.out.printf("The Pair founded (%d, %d)", number[i], number[j]);
                    return;
                }
            }
        }
        System.out.println("Pairt not found");
    }

    public static void main(String[] args) {
        int number[] = { 8, 7, 2, 5, 3, 1 };
        int target = 8;
        pairgiven(number, target);
    }
}
