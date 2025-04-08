package arrays.twoPointer;

public class FindMax {

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));

    }
    public static int findMaxConsecutiveOnes(int[] nums) {

    int newN = 0;
    int max = 0;

    for (int i=0; i< nums.length; i++){
        if (nums[i] == 1){
            newN++; //1 - 2
        } else {
            max = Math.max(max, newN);
            newN = 0;
        }
    }

    return Math.max(max, newN);
}

}
