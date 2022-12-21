package MoveZeros;

public class MovingZerose {
    public void movesZeroes(int arr[]) {
        // create a vaable called start and set equal to the brining of the array
        int start = 0;
        // create a vaable called end and set equal to the brining of the array
        int end = 0;
        // whlie loop that copair the valbe end to arr length
        while (end < arr.length) {
            // if the end of the arr is not equal to 0
            if (arr[end] != 0) {
                // move the start++ and
                arr[start++] = arr[end];
            }
            end++;
        }
        while (start < arr.length) {
            arr[start++] = 0;
        }

        // [0,1,0,3,12] ==> [12, 1, 0, 3, 0]
    }

    public static void main(String[] args) {

    }
}
