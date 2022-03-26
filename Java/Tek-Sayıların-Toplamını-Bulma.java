/* Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri
kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.


 */
import java.util.Scanner;

public class Döngüler {

    public static void main(String[] args) {

        int k = 0;
        int total = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("lütfen sayı giriniz: ");
            k = input.nextInt();
            if( k % 2 == 0 && k % 4 == 0){
                    total +=k;

            }
        } while (k % 2 == 0);
        System.out.println("Çift ve 4'ün katı olan sayıların toplamı: " + total);
    }
        }
