package ReverseArray.EfficientReversArray;

public class RverseArray {
    public void revernumber(int number[]) {
        // The start of the array
        int start = 0;
        // The end of the array
        int end = number.length; // 1, 2, 3, 4, 5

        // Compair the start and the end of the array
        while (start < end) {

            // creating a temp value
            int temp = number[start];

            // Swapint the elements
            number[start] = number[end];
            number[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5 };
        System.out.println(number);
    }
}
