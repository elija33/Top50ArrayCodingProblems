package MoveZeros;

public class MovingZerose {
    public void movesZeroes(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < arr.length - 1; i++) {
            // [0,1,0,3,12] ==> [12, 1, 0, 3, 0]
            // ^ ^ ^ ^
            if (arr[start] != 0 && arr[end] == 0) {
                start++;
                end--;
            } else if (arr[start] == 0 && arr[end] != 0) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[start] = temp;
                end--;
                start++;
            }
        }
    }

    public static void main(String[] args) {

    }
}
