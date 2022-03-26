/*
Java ile 4 tane sayma sayısından en büyük ve en küçük sayıları bulan ve
bu sayıları ekrana yazan programı yazın.
*/

import java.util.Scanner;

public class Döngüler {

    public static void main(String[] args) {

        int number;
        int min=0;
        int max=0;

        for(int i = 1; i <= 4; i++){

            Scanner input = new Scanner(System.in);
            System.out.print(i + ".Sayıyı Giriniz : ");
            number = input.nextInt();

            if(number>max){
                max = number;
            } else {
                min = number;
            }

        }
        System.out.println();

        System.out.println("En Büyük Sayı : " + max);
        System.out.println("En Küçük Sayı : " + min);

    }
}
