/*
Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.
*/
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        Scanner scan = new Scanner(System.in);
        int right = 0;
        int selectedNumber;
        int[]wrong = new int[5]; // yanlış tahminler
        boolean isWin = false;  
        boolean isWrong = false; // hatalı giriş

        while(right < 5) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            selectedNumber = scan.nextInt();

            if(selectedNumber < 0 || selectedNumber > 99 ) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if(isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : \" + (5 - right))");
                }else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if(selectedNumber == number ) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğini sayı : " + number);
                isWin = true;
                break;
            } else {
                if (selectedNumber > number) {
                    System.out.println(selectedNumber + " sayısı, bulmaya çalıştığınız sayıdan büyüktür.");
                }else {
                    System.out.println(selectedNumber + " sayısı, bulmaya çalıştığınız sayıdan küçüktür.");
                }
                wrong[right++] = selectedNumber;
                System.out.println("Kalan hakkınız : " + (5 - right));
            }

        }

        if(!isWin) {
            System.out.println("Kaybettiniz ! ");
            if(!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
                System.out.println("Doğru sayı : "  +  number);

            }

        }

    }
}
