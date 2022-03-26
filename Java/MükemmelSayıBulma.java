/*
Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya
mükemmel sayı denir.
*/

import java.util.Scanner;

public class Döngüler {

    public static void main(String[] args) {

        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz: ");
        int number = input.nextInt();

        for(int i = 1; i < number; i++){
            if(number % i == 0){
                total += i;
            }
        }
        if(number == total){
            System.out.println(number + " Mükemmel Bir Sayıdır");
        } else {
            System.out.println(number + " Mükemmel Bir sayı Değildir");
        }
    }
}
