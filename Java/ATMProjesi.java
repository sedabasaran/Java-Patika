/*
Döngüler ve Karar Mekanizmaları - ATM Projesi
Java döngüler ile kullanıcının banka hesabını yönetebildiği bir ATM projesi yapıyoruz.
*/

import java.util.Scanner;

public class Döngüler {

    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 2000;
        int select;

        while (right > 0){
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();
            if(userName.equals("patika") && password.equals("dev1234")){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz");
                do {
                    System.out.println("1 - Para Yatırma\n" +
                            "2 - Para Çekme\n"+
                            "3 - Bakiye Sorgulama\n" +
                            "4 - Çıkış Yap");
                    System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz:");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Para Miktarınız : ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("İşlem Başarılı.. \n");
                            continue;
                        case 2:
                            System.out.print("Para Miktarınız : ");
                            price = input.nextInt();
                            if(price > balance){
                                System.out.println("Yetersiz Bakiye,Tekrar Deneyiniz");
                            }else {
                                balance -= price;
                                System.out.println("İşlem Başarılı..\n");
                            }
                            continue;
                        case 3:
                            System.out.println("Mevcut Bakiyeniz : " + balance);
                    }
                    continue;
                }while (select !=4);
                System.out.println("Tekrar Görüşmek Üzere");
                break;
            }else {
                right--;
                System.out.println("Hatalı Kulllanıcı Adı veya Şİfre, Tekrar deneyiniz");
                if (right == 0){
                    System.out.println("Hesabınız Bloke Olmuştur, Lütfen Bankanız ile İletişime Geçiniz");
                } else {
                    System.out.println("Kalan hakkınız : " + right);
                }
            }
        }
    }
}

