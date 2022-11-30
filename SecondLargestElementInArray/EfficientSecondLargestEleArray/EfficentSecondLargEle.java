package SecondLargestElementInArray.EfficientSecondLargestEleArray;

public class EfficentSecondLargEle {
    public static int SecondLarEleArray(int number[]) {
        int result = -1;
        int largest = 0;
        for (int i = 1; i < number.length - 1; i++) {
            if (number[i] > number[largest]) {
                result = largest;
                largest = i;
            } else if (number[i] != number[largest]) {
                if (result == -1 || number[i] > number[result]) {
                    result = i;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int number[] = { 5, 20, 12, 20, 8 };
        System.out.println(SecondLarEleArray(number));
    }
}
