package Giris;
import java.util.Scanner;

// Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

public class ücgen {
    public static void main(String[] args) {
        int a, b, c;
        double u, cevre, alan;

        // kullanıcıdan veri alma

        Scanner girdi = new Scanner(System.in);
        System.out.print("LÜTFEN 1.Cİ KENARI GİRİNİZ : ");
        a = girdi.nextInt();
        System.out.print("LÜTFEN 2.Cİ KENARI GİRİNİZ : ");
        b = girdi.nextInt();
        System.out.print("LÜTFEN 3.Cİ KENARI GİRİNİZ : ");
        c = girdi.nextInt();
        u = (a+b+c) / 2;
        cevre = (2*u);
        alan = Math.sqrt(u * (u-a)* (u-b) * (u-c));
        System.out.println("ÇEVRE : " + cevre);
        System.out.println("ALAN : " + alan);

    }
}
