package ReplaceEleGreatestEleRightSide;

public class GreatestEleRightSide {
    public static int replaceElements(int arr[]) {
        // [17,18,5,4,6,1]
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                System.out.print(count);
            }
        }
        return 0;
    }
    // count = 17
    // arr = [17, 18, 5, 4, 6, 1]
    // 0 == 17

    public static void main(String[] args) {
        int number[] = { 17, 18, 5, 4, 6, 1 };
        System.out.println(replaceElements(number));
    }
}
