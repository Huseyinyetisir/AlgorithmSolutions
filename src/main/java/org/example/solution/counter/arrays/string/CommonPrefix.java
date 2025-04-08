package arrays.string;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonPrefix {

    public static void main(String[] args) {
        String[] strArray = {"aaa","aa","aaa"};
        System.out.println(longestCommonPrefix(strArray));
    }

    public static String longestCommonPrefix(String[] strs) {

        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int idx = 0;
        while (idx < first.length() && idx < last.length()) {
            if (first.charAt(idx) == last.charAt(idx)) {
                sb.append(first.charAt(idx));
                idx++;

            } else {
                break;
            }
        }
        return sb.toString();
    }
}
