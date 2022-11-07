package DuplicateElementLimitedRange;

public class Duplicateelement {

    // Function to find a duplicate element in a limited range array
    public static int findDuplicate(int number[]) {

        // Create a visited array of size `n + 1`
        // we can also use a map instead of a visited array
        boolean visited[] = new boolean[number.length + 1];

        // Mark each array element as visited and return if if seen before
        for (int num : number) {

            // if the element is seen before
            if (visited[num]) {
                return num;
            }

            // mark element is seen before
            visited[num] = true;
        }
        // no duplicate found
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 1, 4, 2, 3, 4, 2, 3, 3, 5, 4 };
        System.out.println("The duplicate element is " + findDuplicate(number));
    }
}
