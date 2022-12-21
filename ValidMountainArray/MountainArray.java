package ValidMountainArray;

public class MountainArray {
    public static boolean ValidMountain(int arr[]) {
        if (arr.length < 3)
            return false;
        int i = 0;
        for (; i < arr.length - 1; i++) { // [0,3,2,1]
            if (arr[i] > arr[i + 1]) {
                i++;
                break;
            } else if (arr[i] == arr[i + 1]) {
                return false;
            }
        }
        if (i < 2)
            return false;
        for (; i < arr.length - 1; i++) {
            if (arr[i - 1] <= arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number[] = { 3, 5, 5 };
        System.out.println(ValidMountain(number));
    }
}
