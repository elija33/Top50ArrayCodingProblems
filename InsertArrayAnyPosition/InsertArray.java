package InsertArrayAnyPosition;

public class InsertArray {
    public static int array(int number[], int numberinsert, int n, int position) {
        for (int i = n - 1; i >= position; i--) {
            number[i + 1] = number[i];
            number[position] = numberinsert;
        }
        return 0;
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 1, 8, 5, 10 };
        int position = 4;
        int numberinsert = 10;
        int n = 6;
        System.out.println("Before Insertion: ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }

        array(number, numberinsert, n, position);
        n += 1;

        System.out.println("\n\n After Insertion");
        for (int i = 0; i < n; i++) {
            System.out.println(number[i] + " ");
        }
    }
}
