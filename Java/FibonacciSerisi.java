/*
Java döngüler ile fibonacci serisi bulan program yazıyoruz.
Fibonacci serisinin eleman sayısını kullanıcıdan alın.
*/

import java.util.Scanner;

public class Döngüler {

    public static void main(String[] args) {
        int number1 = 0, number2 = 1, number3 ;
        int fibo;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        fibo = input.nextInt();
        System.out.println(number1+ "\n" +number2);
        
        for(int i = 2; i <= fibo; i++){
            number3 = number1 + number2;
            System.out.println(number3);
            number1 = number2;
            number2 = number3;
        }
    }
}
