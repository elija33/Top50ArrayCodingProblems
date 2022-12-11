package InsertArrayAtIndex;

public class ElementInsert {
    public void element(int number[], int capt, int elementInset) {
        for (int i = number.length - 1; i > capt; i--) {
            number[i] = number[i - 1];
        }
        number[capt] = elementInset;
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 3, 5, 6, 9 };
        System.out.println();

    }
}
