/*
Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
Lütfen Basamak Sayısı Giriniz: 5
 ******* 
  ***** 
   *** 
    * 
    
*/

import java.util.Scanner;

public class Döngüler {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Basamak Sayısı Giriniz: ");
        int number = input.nextInt();

        for (int i = number - 1; i >= 1 ; i--) {
            for (int j = 1; j <= (number - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
