package org.example.solution.random;

import java.util.Scanner;

public class FirstFactorial {

    public static int FirstFactorial(int num) {
        return (num == 1 ? 1 : num * FirstFactorial(num - 1));
       }



    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(Integer.parseInt(s.nextLine())));
    }
}
