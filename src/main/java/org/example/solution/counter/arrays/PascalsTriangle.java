package arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>(); // Call method with numRows = 5
        result = generate(5);
        // Print the result using enhanced for loop
        for (List<Integer> row : result) {
            System.out.println(row);
        }

    }

    public static List<Integer> generateRow(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
            }
            triangle.add(row);
        }
        return triangle.get(numRows-1);
    }



    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
            }
            triangle.add(row);
        }
        return  triangle;
    }

}
