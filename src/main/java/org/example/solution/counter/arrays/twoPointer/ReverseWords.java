package arrays.twoPointer;

public class ReverseWords {


    public static void main(String[] args) {
        System.out.println(reverseWord("Hello   World"));


    }


    public static String reverse(String s){

        s = s.trim();

        String[] words = s.split("\\s+");

        StringBuilder reversed = new StringBuilder();

        for (int i = words.length-1; i>=0; i--){
            reversed.append(words[i]);
            if (i>0){
                reversed.append(" ");
            }

        }


    return reversed.toString();
    }

    public static String reverseWord(String s) {
        int lastSpaceIndex = -1;
        char[] chArray = s.toCharArray();
        int len = s.length();
        for (int strIndex = 0; strIndex <= len; strIndex++) {
            if (strIndex == len || chArray[strIndex] == ' ') {
                int startIndex = lastSpaceIndex + 1;
                int endIndex = strIndex - 1;
                while (startIndex < endIndex) {
                    char temp = chArray[startIndex];
                    chArray[startIndex] = chArray[endIndex];
                    chArray[endIndex] = temp;
                    startIndex++;
                    endIndex--;
                }
                lastSpaceIndex = strIndex;
            }
        }
        return new String(chArray);
    }





}
