package Whohasthemajority;

public class majority {
    public int majorityWins(int arr[], int x, int y) {
        int couty = 0, coutx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == y) {
                couty++;
            }
            if (arr[i] == x) {
                coutx++;
            }
        }
        if (couty > coutx) {
            return y;
        } else if (coutx > couty) {
            return x;
        } else if (coutx == couty) {
            if (x < y) {
                return x;
            } else {
                return y;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5 };

    }
}
