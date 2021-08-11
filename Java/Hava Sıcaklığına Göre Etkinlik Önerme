/* Java koşullu ifadeler ile hava sıcaklığına göre etkinlik öneren program yapımı.
Koşullar :
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner. 
*/


import java.util.Scanner;

public class sıcaklık {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen hava sıcaklık değerini giriniz");

        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("kayak yapabilirsiniz");
        } else if (heat <= 25) {
            if (heat <= 15) {
                System.out.println("sinemaya gidebilirsiniz");
            }
            if (heat >= 10) {
                System.out.println("pikniğe gidebilirsiniz");
            }
        }else {
                System.out.println("yüzmeye gidebilirsiniz");
        }
        
    }
}
