package org.example.solution.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
 *
 * Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,0,2,3,0,4,5,0]
 * Output: [1,0,0,2,3,0,0,4]
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 * Example 2:
 *
 * Input: arr = [1,2,3]
 * Output: [1,2,3]
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 *
 *
 * Constraints:
 *
 * 1 <= arr.length <= 104
 * 0 <= arr[i] <= 9
 *
 *
 */


//PSEUDO
    //Inputun içinde bir sıfır gördüğümüzde sonraki index de sıfır eklenmeli
    //Bir tane boş array tanımla
    //Girdi arraydeki indexleri gez
    //İnputun lengthîni al
    //Eğer sıfır değilse doğrudan boş aaraye ekle
    //eğer sıfır ise boş arraye 2 kez sıfır ekle
    //inputun lengthine ulaşınca döngüden çık
    //Yeni arrayı döndür


public class DuplicateZeros {


    public static void main(String[] args) {
        int[] sample = new int[]{1,0,2,3,0,4,5,0};
        System.out.println("Input lenght: "+sample.length);
        duplicateZeros(sample);
    }

    public static void duplicateZeros(int[] arr){ //{1,0,2,3,0,4,5,0}

        List<Integer> newArray = new ArrayList<Integer>(arr.length);
        List<Integer> lastArray = new ArrayList<Integer>(newArray);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                newArray.add(arr[i]);
                newArray.add(arr[i]);
            } else {
                newArray.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            lastArray.add(newArray.get(i));
        }
    }
}
