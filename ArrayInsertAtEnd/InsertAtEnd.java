package ArrayInsertAtEnd;

public class InsertAtEnd {
    public static int InsertAtEnd(int array[], int sizeOfArray, int n, int elementInsert) {
        if (n == sizeOfArray)
            System.out.println("The array is full");
        else if (array.length >= sizeOfArray)
            return n;
        array[n] = elementInsert;
        return (n + 1);
    }

    public static void main(String[] args) {
        int array[] = { 3, 4, 6, 7, 1, 9 };
        int elementInsert = 10;
        int sizeOfArray = 8;
        int n = 6;
        System.out.println("Before Insertion Element: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        n = InsertAtEnd(array, sizeOfArray, n, elementInsert);
        System.out.println("\n After Insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
