/* Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. 
Her çıkarma işlemi sırasında ekrana son değeri yazdırın. 
Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. 
Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
 */

package com.company;

import java.util.Scanner;

public class Main {

    static void minus(int number,int temp){
        System.out.print(number+" ");
        if(number==0 || number<0){
            plus(number+5,temp);
        }
        else{
            minus(number-5,temp);
        }
    }

    static void plus(int number,int temp){
        System.out.print(number+" ");
        if(number==temp){
            return ;
        }
        else{

            plus(number+5,temp);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int Number=input.nextInt();
        int temp = Number;
        minus(Number, temp);

    }
}
