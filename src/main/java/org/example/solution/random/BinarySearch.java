package org.example.solution.random;

/**
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
 * If target exists, then return its index.
 * Otherwise, return -1.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 * Example 2:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 */
public class BinarySearch {
    public static int search(int[] nums, int target) {
        for (int i= 0; i< nums.length;i++){
            if (nums[i] == target){
                // -1 == 9 => No
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] intArray = new int[]{-1,0,3,5,9,12};
        System.out.println(search(intArray,2));
    }
}
