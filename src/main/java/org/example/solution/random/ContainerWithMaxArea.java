package org.example.solution.random;

public class ContainerWithMaxArea {


    public static void main(String[] args) {

        int[] heights = {1,8,6,2,5,4,8,3,7};
        findMaxArea(heights);
    }

    public static void findMaxArea(int[] height){

        int left = 0, right = height.length -1;
        int area, maxArea = 0;
        while (left < right) {
            if (height[left] > height[right]) {
                area = height[right] * (right - left);
            } else {
                area = height[left] * (right - left);
            }

            if (area > maxArea){maxArea = area;}

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(maxArea);

    }
}
