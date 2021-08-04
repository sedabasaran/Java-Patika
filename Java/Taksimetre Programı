package Giris;

/* Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
*/

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total, startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen mesafeyi km cinsinden giriniz: ");

        km = input.nextInt();

        total = ((km * perKm) + startPrice);
        total = (total < 20) ? 20 : total;
        System.out.println("Taksimetre toplam tutarınız: " + total);

    }

}
