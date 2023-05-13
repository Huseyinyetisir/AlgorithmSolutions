package org.example.solution.array;

//Requirements:
//
//        Her açılan parantezin kapanması gerekir
//        Açılmamış bir parantez kapatılamaz
//        Test Cases:
//        Input Output Reason

//        ( ) True
//        ) ( False - Açılmamış bir parantez kapatılamaz
//        ( ( ) False - Her açılan parantezin kapanması gerekir
//        ( ( ) ( ) ) True
//        ( ) ) ( ( ) False - Açılmamış bir parantez kapatılamaz
public class alihanInteview {


    public static boolean dogruMuYanlisMi(String str) { //(()())
        int count = 0;
        int j = 0;
            for (int i = 0; i < str.length(); i++) {
                if (count == 0 && str.charAt(i) == ')'){return false;}
                if (str.charAt(i) == '(') {
                    count++;
                } else if (str.charAt(i) == ')') {
                    count--;
                }
            }
            if (count == 0) {
                return true;
            }

        return false;
    }




    public static void main(String[] args){
        String ornek = "())(()"; //False
        System.out.println(dogruMuYanlisMi(ornek));

    }
}
