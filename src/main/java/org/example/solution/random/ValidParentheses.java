package org.example.solution.random;

import java.util.Stack;

//
//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//        An input string is valid if:
//
//        Open brackets must be closed by the same type of brackets.
//        Open brackets must be closed in the correct order.
//        Every close bracket has a corresponding open bracket of the same type.
//
//
//        Example 1:
//
//        Input: s = "()"
//        Output: true
//        Example 2:
//
//        Input: s = "()[]{}"
//        Output: true
//        Example 3:
//
//        Input: s = "(]"
//        Output: false
//
public class ValidParentheses {
    public boolean isValid(String s) {

        if (s.length() % 2 != 0) return false;

        Stack<Character> stack= new Stack();
        for (char c : s.toCharArray()){
            if (c == '(' ||c ==  '{' ||c ==  '['){
                stack.push(c);
                //System.out.println("1. :" + stack.push(c));
            }else if (c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
                //System.out.println("2. :" + stack.peek());
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
                //System.out.println("3. :"+ stack.peek());
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
                //System.out.println("1. :" + stack.push(c));
            }

        }
        return stack.isEmpty();
    }

}
