/* Burç Bulan Program - Java koşullu ifadeler ile kullanıcının burcunu bulan program yapımı.
Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
 */

package Giris;
import java.util.Scanner;

public class Burc {
    public static void main(String[] args){
        int month, day;
        String burc = "";
        boolean isError = false;


        Scanner input = new Scanner(System.in);
        System.out.print("Doğdunuz ayı rakam olarak giriniz: ");
        month = input.nextInt();

        System.out.print("Doğdunuz günü rakam olarak giriniz: ");
        day = input.nextInt();

        switch (month){
            case 1:
                if(day >= 1 && day <= 31){
                    if (day < 22){
                        burc = "Oglak";
                    } else {
                        burc = "Kova";
                    }
                } else {
                    isError = true;
                }
                break;

            case 2:
                if(day >= 1 && day <=28) {
                    if (day < 20) {
                        burc = "Kova";
                    } else {
                        burc = "Balık";
                    }
                }
                else {
                        isError = true;
                    }
                break;

            case 3:
                if(day >=1  && day <= 31) {
                    if (day < 21) {
                        burc = "Balık";
                    } else {
                        burc = "Koç";
                    }
                }else {
                        isError = true;
                    }
                break;

            case 4:
                if(day >=1 && day <=30) {
                    if (day < 21) {
                        burc = "Koç";
                    } else {
                        burc = "Boğa";
                    }
                }else {
                        isError = true;
                    }
                break;

            case 5:
                if (day >=1 && day <=31){
                    if(day <22){
                        burc = "Boğa";
                    } else {
                        burc = "İkizler";
                    }
                } else {
                    isError = true;
                }
                break;

            case 6:
                if (day >=1 && day <= 30){
                    if(day <23){
                        burc = "İkizler";
                    } else {
                        burc = "Yengeç";
                    }
                } else {
                    isError = true;
                }
                break;

            case 7:
                if(day >=1 && day <= 31){
                    if(day <23){
                        burc = "Yengeç";
                    } else {
                        burc = "Aslan";
                    }
                } else {
                    isError = true;
                }
                break;

            case 8:
                if(day >=1 && day <=31){
                    if(day <23) {
                        burc = "Aslan";
                    } else {
                        burc = "Başak";
                    }
                } else {
                    isError = true;
                }
                break;

            case 9:
                if (day >=1 && day <= 30){
                    if (day<23){
                        burc = "Başak";
                    }else {
                        burc = "Terazi";
                    }
                } else {
                    isError = true;
                }
                break;

            case 10:
                if(day >=1 && day <= 31){
                    if (day <23){
                        burc = "Terazi";
                    } else {
                        burc = "Akrep";
                    }
                } else {
                    isError = true;
                }
                break;

            case 11:
                if(day >=1 && day <= 30){
                    if (day <22){
                        burc = "Akrep";
                    } else {
                        burc = "Yay";
                    }
                } else {
                    isError = true;
                }
                break;

            case 12:
                if(day >=1 && day <=31){
                    if(day <22){
                        burc = "Yay";
                    } else {
                        burc = "Oğlak";
                    }
                } else {
                    isError = true;
                }
                break;
            default:
                isError = true;
        }

        if(isError){
            System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz.");
        } else {
            System.out.println("Burcunuz :" + burc);
        }
    }

}
