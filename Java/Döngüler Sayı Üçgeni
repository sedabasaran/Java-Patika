/* Konsoldan girilen sayıyı 1 e kadar yazdırıp,aynı satırda tekrardan verilen sayıya kadar yazdıran ve
alt alt 1’er azaltıp aynı işlemi üçgen gibi devam ettiren java algoritma kodunu yazınız
input = 3
3 2 1 2 3
2 1 2
1
*/
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.print("Bir Sayı Giriniz: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        for (int i = number; i >= 1; i-- ){
            for (int j = i; j >=1; j--){
                System.out.print(j + " ");
            }
            for (int k = 2; k <= i; k++){
                System.out.print(k + " ");
            }
            System.out.println("");
        }
    }
}

