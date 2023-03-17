package org.example.solution;


import java.util.Arrays;

public class ReturnDuplicates {

    public static String returnDuplicates(String my_input) {
//        char charArray[] = my_input.toCharArray();
        String duplicates = "";
        for (int i = 0; i < my_input.length(); i++) {
            if (duplicates.indexOf(my_input.charAt(i)) < 0) {
                //System.out.println("IndexOf : "+duplicates.indexOf(my_input.charAt(i)));
                for (int j = i + 1; j < my_input.length() - 1; j++) {
                    if (my_input.charAt(i) == my_input.charAt(j)) {
                        //      System.out.println(my_input.charAt(i) +" == "+my_input.charAt(j));
                        duplicates += my_input.charAt(i);
                        break;
                    }
                }
            }

        }
        return duplicates;
    }



    public static int returnDuplicateInt (int x){

        return x;

    }
    public static void main(String[] args) {
//        System.out.println(returnDuplicates("Hellllooo"));
        System.out.println(returnDuplicateInt(5));
    }
}
