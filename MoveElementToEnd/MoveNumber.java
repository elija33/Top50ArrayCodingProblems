package MoveElementToEnd;

import java.util.Collection;
import java.util.List;

public class MoveNumber {
    public static List<Integer> moveElementToEnd(List<Integer> number, int movetoend) {
        int start = 0;
        int end = number.size() - 1;
        while (start < end) {
            // if the starting array is not equal to the movenumber, move to the next number
            if (number.get(start) != movetoend) {
                start++;
            } else if (number.get(end) == movetoend) {
                end--;
            } else if (number.get(start) == movetoend && number.get(end) != movetoend) {
                int temp = number.get(end);
                number.set(end, number.get(start));
                number.set(start, temp);
            }
        }
        return number;
    }

    public static void main(String[] args) {
        int number[] = { 2, 1, 2, 2, 2, 3, 4, 2 };
    }
}