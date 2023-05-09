package org.example.solution.array;


/*
Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.
Example 2:

Input: nums = [555,901,482,1771]
Output: 1
Explanation:
Only 1771 contains an even number of digits.


Constraints:
1 <= nums.length <= 500
1 <= nums[i] <= 10^5 100000
*/

/*
Input: nums = [555,901,482,1771]
1.Sayı => 555  -> 3
2.sayı => 901 -> 3
3.sayı => 482 -> 3
4.sayı => 1771  -> 3

basamak sayısı çift olmalı



* PSEUDO CODE
boş değişken oluştur -> count
for dönfüsü oluştur
    1.değeri al -> 345
    değeri stringe dönüştür -> "345"
    karakterleri saydır ve bir değişkene ata -> a = 3
    if bloğu  oluştur ve değişken tek mi kontrol et -> true (if a % 2==0)
    count değişkenini 1 arttır
*
* */



public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        int count = 0;
        for (int i=0; i<nums.length;i++){
            String stringNum = String.valueOf(nums[i]);
            int numLength = stringNum.length();
            if (numLength % 2 ==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
