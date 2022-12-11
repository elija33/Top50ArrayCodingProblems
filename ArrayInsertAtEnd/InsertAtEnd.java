package ArrayInsertAtEnd;

public class InsertAtEnd {
    public static int InsertAtEnd(int array[], int sizeOfArray, int elementInsert) {
        array[array.length - 1] = elementInsert;
        return elementInsert;
    }

    public static void main(String[] args) {
        int array[] = { 3, 4, 6, 7, 1, 9 };
        int elementInsert = 10;
        int sizeOfArray = 8;
        System.out.println(InsertAtEnd(array, sizeOfArray, elementInsert));
    }
}
