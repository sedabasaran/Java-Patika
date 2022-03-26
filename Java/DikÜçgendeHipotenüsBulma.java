package Giris;
import java.util.Scanner;

// Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

public class ücgen {
    public static void main(String[] args) {
        int a, b;
        double c;

        // kullanıcıdan veri alma

        Scanner girdi = new Scanner(System.in);
        System.out.print("LÜTFEN 1.Cİ KENARI GİRİNİZ : ");
        a = girdi.nextInt();
        System.out.print("LÜTFEN 2.Cİ KENARI GİRİNİZ : ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.print("HİPOTENÜS : " + c );



    }
}
