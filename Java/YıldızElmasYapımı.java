//Java'da döngüler kullanarak yıldızlar ile elmas yapınız.


import java.util.Scanner;

public class Döngüler {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int n = input.nextInt();

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = n-1; i >= 1 ; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
