/*
Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.

Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir.
Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur.
Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.
Örneğin aşağıdaki 2x3’lik A matrisinin transpozu (devriği), 2x3’lük bir A^T matrisidir.
Senaryo
Matris :
2    3    4
5    6    4
Transpoze :
2    5
3    6
4    4
*/

package Hafta1.Hw1;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3 },{4,5,6}};
        System.out.println("Matrix :");

        for (int[] ints : matrix) {
            for (int i : ints) System.out.print(i + "   ");
            System.out.println();
        }
        System.out.println();
        System.out.println("Transpoze:");
        for (int i = 0; i < matrix[0].length; i++) {
            for (int[] j : matrix) System.out.print(j[i] + "    ");
            System.out.println();
        }
    }
}
