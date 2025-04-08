package arrays;

import java.util.ArrayList;
import java.util.List;

/*
Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.

Example 1:
Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,4,7,5,3,6,8,9]

Example 2:
Input: mat = [[1,2],[3,4]]
Output: [1,2,3,4]

Constraints:
m == mat.length
n == mat[i].length
1 <= m, n <= 104
1 <= m * n <= 104
-105 <= mat[i][j] <= 105
 */
public class DiagonalOrder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        // Test case 1
        int[][] mat1 = {
                {1, 2, 3}, //(0,0), (0,1), (0,2)
                {4, 5, 6}, //(1,0), (1,1), (1,2)
                {7, 8, 9}  //(2,0), (2,1), (2,2)
        };
        List<Integer> result = new ArrayList<>();
        result = spiralOrder(mat1);
        for (int num: result) {
            sb.append(num).append(" ");
        }
        System.out.println(sb.toString().trim());
    }


    public static List<Integer> spiralOrder(int[][] matrix) {

        int top = 0, bottom = matrix.length -1; // rows
        int left = 0, right = matrix[0].length -1; // columns

        List<Integer> spiralResult = new ArrayList<>();

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++)
                spiralResult.add(matrix[top][i]);
            top++;

            for (int i = top; i <= bottom; i++)
                spiralResult.add(matrix[i][right]);
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    spiralResult.add(matrix[bottom][i]);
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    spiralResult.add(matrix[i][left]);
                left++;
            }
        }
        return spiralResult;
    }



    public static int[] findDiagonalOrder(int[][] mat) {

        int n = mat.length, m= mat[0].length;

        int[] diagonalOrder = new int[m * n];

        int row = 0, col = 0, dir = 1;

        for (int i = 0; i < m * n; i++) {
            diagonalOrder[i] = mat[row][col];


            if (dir == 1) { // Moving Up-Right
                if (col == n - 1) {
                    row++;
                    dir = -1;  // Out of bounds at right
                } else if (row == 0) {
                    col++;
                    dir = -1;  // Out of bounds at top
                } else {
                    row--;
                    col++; // Normal Up-Right move
                }
            } else { // Moving Down-Left
                if (row == m - 1) {
                    col++;
                    dir = 1;  // Out of bounds at bottom
                } else if (col == 0) {
                    row++;
                    dir = 1;  // Out of bounds at left
                } else {
                    row++;
                    col--; // Normal Down-Left move
                }
            }
        }
        return diagonalOrder;
    }


}
