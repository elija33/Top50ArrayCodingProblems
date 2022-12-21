package SortArrayByParity;

public class SortArraysParitys {
    public static int[] SortArrayByParitys(int arr[]) {
        int start = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                int temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;
                start++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 4 };
        System.out.println(SortArrayByParitys(arr));
    }
}
