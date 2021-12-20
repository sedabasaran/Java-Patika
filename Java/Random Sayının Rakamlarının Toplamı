/*0 ile 1000 arasında random bir sayı oluşturarak bu sayının rakamları
toplamını veren java algoritma kodunu yazınız
 */
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int randomNumber = (int)(Math.random()*1000);
        System.out.println("Üretilen random sayı: " + randomNumber);

        int birler = randomNumber % 10;
        randomNumber = randomNumber / 10;

        int onlar = randomNumber % 10;
        randomNumber = randomNumber / 10;

        int yuzler = randomNumber % 10;
        randomNumber = randomNumber / 10;
        
        System.out.println("Sayının Rakamları Toplamı: " + (birler+onlar+yuzler));
    }
}
