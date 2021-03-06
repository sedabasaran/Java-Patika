/* Uçak Bileti Fiyatı Hesaplayan Program
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara
göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
 */

package Giris;
import java.util.Scanner;

public class Bilet {
    public static void main(String[] args){
        int km, yas,tip;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();

        System.out.print("Yaşınızı rakam olarak giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        tip = input.nextInt();

        double fiyat, yasIndirimi, tipIndirimi;

        if(km > 0 && yas > 0 && (tip == 1 || tip == 2)) {
            fiyat = km * 0.10;
            if(yas < 12 ){
                yasIndirimi = fiyat * 0.5; // indirim oronı
            } else if(yas >= 12 && yas <= 24){
                yasIndirimi = fiyat * 0.10;
            } else if(yas >= 65){
                yasIndirimi = fiyat * 0.30;
            } else {
                yasIndirimi = 0;
            }
            fiyat -= yasIndirimi;
            if(tip == 2) {
                tipIndirimi = fiyat * 0.20;
                fiyat = (fiyat - tipIndirimi) * 2;

            }
            System.out.println( "Bilet Tutarı " + fiyat);

        } else {
            System.out.println("Girdiler Yanlış");
        }

    }

}
