//Java döngüler ile girilen sayıya kadar olan 4'ün kuvvetlerini ekrana yazdıran programı yazıyoruz.

import java.util.Scanner;

public class Döngüler {

    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("lütfen bir sayı giriniz: ");
        number = input.nextInt();
        int i=1;

        while (i<= number){
            i*=4;
            System.out.println("4'ün kuvvetleri:" + i);
            }
    }

}
