package Giris;

// Yarıçapı r, merkez açısısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        int r, acı;
        double alan, pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen dairenin yarıçapını yazınız: ");
        r = input.nextInt();

        System.out.print("Lütfen merkez açısısının ölçüsünü yazınız: ");

        acı = input.nextInt();

        alan = (pi * (r*r) * acı) / 360;
        System.out.println("Daire diliminin alanı : " + alan);

    }

}
