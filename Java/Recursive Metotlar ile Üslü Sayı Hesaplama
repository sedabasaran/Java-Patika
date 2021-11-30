package com.company;

import java.util.Scanner;
public class Main {

    static int usAlma(int taban, int us){
        if (taban == 1 || us == 0) {
            return 1;
    }
        return taban * usAlma(taban, us - 1);
    }

    public static void main(String[] args) {

        int taban,us;

        Scanner scan = new Scanner(System.in);
        System.out.println("Üssü alınacak sayıyı giriniz: ");
        taban = scan.nextInt();
        System.out.println("Üs olacak sayıyı giriniz: ");
        us = scan.nextInt();

        System.out.println("Sonuç: " + usAlma(taban, us));

    }
}
