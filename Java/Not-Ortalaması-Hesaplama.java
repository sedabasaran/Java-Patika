/* Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve 
ortalamalarını hesaplayıp ekrana bastırılan programı
yazın. Koşullu ifade kullanılmayacaktır. */

package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {

        int mat, fizik, kimya, türkce, tarih, muzik;

        // Scanner sınıfımızı tanımlıyoruz.

        Scanner input = new Scanner(System.in);

        System.out.println("Lüften Matematik Notunuzu Giriniz");
        mat = input.nextInt();

        System.out.println("Lüfen Fizik Notunuzu Giriniz");
        fizik = input.nextInt();

        System.out.println("Lüfen Kimya Notunuzu Giriniz");
        kimya = input.nextInt();

        System.out.println("Lüfen Türkce Notunuzu Giriniz");
        türkce = input.nextInt();

        System.out.println("Lüfen Tarih Notunuzu Giriniz");
        tarih = input.nextInt();

        System.out.println("Lüfen Müzik Notunuzu Giriniz");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + türkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız " + sonuc);
        

    }
}
