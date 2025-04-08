package arrays.twoPointer;

public class RemoveElement {

    public static void main(String[] args) {
        int k;
        int[] nums = {3,2,2,3};
        k = removeElement(nums, 2);
        System.out.println(k);
    }
    public static int removeElement(int[] nums, int val) {

        int slow=0, fast=nums.length-1;
        int k = 0;

        while (slow<fast){
            if(nums[slow] == val){
                k++;
                int temp;
                temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                fast--;
            }
            slow++;
        }
        return nums.length - 1 - k;
    }
}
