/*
Ödev
Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

Dizi : {15,12,788,1,-1,-778,2,0}
Girilen Sayı : 5
Girilen sayıdan küçük en yakın sayı : 2
Girilen sayıdan büyük en yakın sayı : 12
 */

package Hafta1.Hw1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] list = {21, 55, 34, 44, -1, -26, 7, 19};
        Scanner scan = new Scanner(System.in);
        Arrays.sort(list);

        System.out.println("Liste: " + Arrays.toString(list));
        System.out.print("Lütfen bir sayı giriniz : ");
        int number = scan.nextInt();

        int min = list[0];
        int max = list[0];

        for (int i : list){
            if (i < number){
                min = i;
            }
            if (i > number){
                max = i;
                break;
            }
        }
        System.out.println("Girilen sayidan kucuk en yakin sayi : "+ min);
        System.out.println("Girilen sayidan buyuk en yakin sayi : "+ max);
    }
}
