/* Java ile kombinasyon hesaplayan program yazınız.
Kombinasyon:
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li 
kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Kombinasyon formülü:C(n,r) = n! / (r! * (n-r)!)
 */

import java.util.Scanner;

public class Döngüler {

    public static void main(String[] args) {

        int n, r;
        int ntotal = 1;
        int rtotal = 1;

        int combination = 1;
        int factorial = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen N Sayısını Giriniz: ");
        n = input.nextInt();

        System.out.print("Lütfen R Sayısını N Saysından Küçük Giriniz: ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            ntotal *= i;
        }
        System.out.println("N Sayısının Faktöriyeli: " + ntotal);

        for (int a = 1; a <= r; a++) {
            rtotal *= a;
        }
        System.out.println("R Sayısının Faktöriyeli: " + rtotal);

        int fark = n-r;

        for (int j= 1; j <= fark; j++){
            factorial *=j;
        }
        System.out.println("N - R Sayısının Faktöriyeli: " + factorial);

        combination = ntotal / (rtotal*(factorial));
        System.out.println("N - R Sayısının Kombinasyonu: " + combination);
        
    }
}
