package arrays.string;
/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

Example 2:
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.

Constraints:
1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
*/

public class ImplStr {

    public static void main(String[] args) {
        System.out.println(strStr2("sabutsad", "sad"));
    }

    public static int strStr2(String haystack, String needle) {
        if (haystack.length() < needle.length()){
            return -1;
        }
        for (int i = 0; i< haystack.length(); i++) {
            if (i + needle.length() > haystack.length()) {
                break;
            }
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
                if (j == needle.length() - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
    public static int strStr(String haystack, String needle) {

        if (haystack.length() < needle.length()){
            return -1;
        }
        for (int i = 0; i< haystack.length() - needle.length() + 1; i++) {
            if (haystack.substring(i, i+ needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
