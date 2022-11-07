package SubarrayZero;

import java.util.HashSet;
import java.util.Set;

public class SubarrayZero {
    // Function to check if subarray with zero sum is present in a given array or
    // not
    public static Boolean ZeroSumSubarray(int number[]) {

        // Create an empty set to store the sum of elements of each
        // Subarray nums[0..1], where 0 <= i < nums.lenght
        Set<Integer> num = new HashSet<>();

        // insert 0 into the set to handle the case when subarray with zero-sum starts
        // from index 0
        num.add(0);

        int sum = 0;

        // Traverse the given array
        for (int valus : number) {

            // Sum of element so far
            sum += valus;

            // if the sum is seen before, we have found a subarray with zero sum
            if (num.contains(sum)) {
                return true;
            }

            // insert sum so far into the set
            num.add(sum);
        }

        // we reach here when no subarray with zero-sum exists
        return false;
    }

    public static void main(String[] args) {
        int number[] = { 4, -6, 3, -1, 4, 2, 7 };
        if (ZeroSumSubarray(number)) {
            System.out.println("Subarray exists");
        } else {
            System.out.println("Subarray does not exist");
        }
    }
}