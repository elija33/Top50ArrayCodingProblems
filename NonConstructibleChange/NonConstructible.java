package NonConstructibleChange;

import java.util.Arrays;

public class NonConstructible {
    public static int nonConstructible(int coins[]) {
        Arrays.sort(coins);
        int currcoins = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] > currcoins + 1) {
                return currcoins + 1;
            } else {
                currcoins += coins[i];
            }
        }
        return currcoins + 1;
    }

    public static void main(String[] args) {
        int coins[] = { 5, 7, 1, 1, 2, 3, 22 };
        System.out.println(nonConstructible(coins));
    }
}
