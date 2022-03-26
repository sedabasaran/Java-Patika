/*Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e
tam bölünen sayıların toplamı hesaplayan programı yazınız.
*/
import java.util.Scanner;

public class Döngüler {

    public static void main(String[] args) {
        
        int k;
        Scanner input = new Scanner(System.in);
        System.out.print("lütfen sayı giriniz: ");

        k = input.nextInt();
        int toplam = 0;

        for(int i = 0; i<k; i++){
            if(i % 12 == 0) {
                toplam +=i;
                System.out.println(" 3 ve 4'e bölünebilen sayıların toplamı: " + toplam);

            }

        }
        
    }

}
