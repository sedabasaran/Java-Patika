// Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
import java.util.Scanner;
public class Sıralama {

    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen 1.sayıyı giriniz");
        a = input.nextInt();

        System.out.println("Lütfen 2.sayıyı giriniz");
        b = input.nextInt();

        System.out.println("Lütfen 3.sayıyı giriniz");
        c = input.nextInt();

        if ((a < b) && (a < c)){
            if (b < c){
                System.out.println("a < b < c");
            } else {
                System.out.println("a < c < b");
            }
        } if ((b < a) && (b < c)){
            if(a < c){
                System.out.println("b < a < c");
            }else {
                System.out.println("b < c < a");
            }
        } if ((c < b) && (c < a)){
            if (b < a){
                System.out.println("c < b < a");
            }else {
                System.out.println("c < a < b");
            }
        }


    }

}

