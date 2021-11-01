/*
Java ile iki sayının EKOK değerlerini "While Döngüsü" kullanarak yazınız.
*/

import java.util.Scanner;

public class Döngüler {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        int number1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        int number2 = input.nextInt();

        int i = 1;
        while (i<=(number1 * number2)){
            if(i % number1 == 0 && i % number2 == 0){
                break;
            }
            i++;
        }
        System.out.println("Girdiğiniz Sayıların Ekoku: " + i);
    }
}
