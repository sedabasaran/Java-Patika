import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {

        int number1,number2,select;

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci Sayıyı Giriniz: ");
        number1 = input.nextInt();
        System.out.println("İkinci Sayıyı Giriniz: ");
        number2 = input.nextInt();

        System.out.println("1.Toplama \n2.Çıkarma \n3.Çarpma \n4.Bölme ");

        System.out.println("Seçiminiz : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplama İşleminin Sonucu: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Çıkarma İşleminin Sonucu: " +(number1 - number2));
                break;
            case 3:
                System.out.println("Çarpma İşleminin Sonucu: " +(number1 * number2));
                break;
            case 4:
                if(number2!= 0)
                    System.out.println("Bölme İşleminin Sonucu: " + (number1 / number2));
                else {
                    System.out.println("Sayı 0'a bölünemez.");
                }
                break;
            default:
                System.out.println("Yanlış Seçim Yaptınız, Tekrar Deneyiniz");
                break;
        }

    }


}
