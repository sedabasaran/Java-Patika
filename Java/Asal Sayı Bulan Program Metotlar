/*Java dilinde "Recursive" metot kullanarak,
kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
 */

package com.company;

import java.util.Scanner;

public class Main {

    static boolean asal(int number) {
        int control = 0;
        for(int i = 2; i < number; i++)
        {
            if(number % i == 0) {
                control++;
            }
        }
        if(control == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number = scan.nextInt();

        if(asal(number)) {
            System.out.println(number + " sayısı ASALDIR !");
        }
        else {
            System.out.println(number + " sayısı ASAL değildir !");
        }
    }
}
