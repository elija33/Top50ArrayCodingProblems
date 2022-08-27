package TwoNumberSum;

public class TwoNumberSum {
    public static int[] NumberSum(int number[], int target){
        for(int i = 0; i < number.length; i++){
            for(int j = i + 1; j < number.length; j++){
                if(number[i] + number[j] == target){
                    return new int[] {number[i] + number[j]};
                }
            }
        }
        return new int[] {};
    } 
    public static void main(String[] args) {
        int number[] = {2,3,4,5,2,8};
        int target = 10;
        NumberSum(number, target);
    }
}
