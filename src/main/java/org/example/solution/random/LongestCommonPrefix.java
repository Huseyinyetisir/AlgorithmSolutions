package org.example.solution.random;

//Write a function to find the longest common prefix string amongst an array of strings.
//
//        If there is no common prefix, return an empty string "".
//
//
//
//        Example 1:
//
//        Input: strs = ["flower","flow","flight"]
//        Output: "fl"
//        Example 2:
//
//        Input: strs = ["dog","racecar","car"]
//        Output: ""
//        Explanation: There is no common prefix among the input strings.

//["flower","flow","flight"]


public class LongestCommonPrefix {
    public String CommonPrefix(String[] strs){
        if (strs.length == 0) return "";
        String prefix = strs[0];  //prefix = flower
        for (int i=1; i<strs.length;i++){  // strs.length = 3
            while (strs[i].indexOf(prefix)!=0) {
                prefix = prefix.substring(0, prefix.length() - 1); //prefix.length()-1 =
            }}
        return prefix;
    }
}
