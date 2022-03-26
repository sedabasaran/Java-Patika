/*
Java'da recursive metotlar ile fibonacci serisi bulan program yapıyoruz.
 */

public class Patika {

    static int fibonacci(int number){
        if (number == 1 || number == 2){
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }

}
