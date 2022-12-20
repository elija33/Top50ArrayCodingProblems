package RemoveDuplicatesFromSortedArray;

public class Duplicates {
    public static int removeDuplicates(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] != arr[i + 1])
                arr[count++] = arr[i];
        arr[count++] = arr[arr.length - 1];

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        for (int i = 0; i < arr.length; i++)
            System.out.println((arr[i]));
    }
}
