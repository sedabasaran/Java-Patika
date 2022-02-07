/*
Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
Dizinin boyutu n : 5
Dizinin elemanlarını giriniz :
1. Elemanı : 99
2. Elemanı : -2
3. Elemanı : -2121
4. Elemanı : 1
5. Elemanı : 0
Sıralama : -2121 -2 0 1 99
*/

package Hafta1.Hw1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz : ");

        int[] list = new int[input.nextInt()];
        for (int i = 0; i < list.length; i++) {
            System.out.print(i + 1 + ": ");
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        System.out.print("Dizideki elemanların küçükten büyüğe sıralanmış hali:");
        System.out.println(Arrays.toString(list));
    }
}
