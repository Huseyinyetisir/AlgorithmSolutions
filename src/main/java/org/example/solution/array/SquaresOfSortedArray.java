package org.example.solution.array;

import java.util.Arrays;


/*"""PSEUDO
nums = [-4,-1,0,3,10]
nums2 = [16,1,0,9,100]

for döngüsüyle nums'in indexlerine girip karesini alip yeni arrayime ekle index sirasiyla

degisen degerleri kucukten buyuge dogru sirala
for da kullanilabilir eger varsa array fonksiyonu da kullanilabilir.  .sort()
*/
public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] array = new int[]{-7,-3,2,3,11};
        for(int i = 0; i<array.length;i++){
            array[i] = array[i]*array[i];
        }
        Arrays.sort(array);
        for (int i=0;i<array.length;i++)System.out.println(array[i]);
    }
}
