// bu videodan yapılmıştır: https://www.youtube.com/watch?v=1vBEwDZrN_U&list=PLEcJSEQK_cD5KHgg9sXumeg659hAr2j4W&index=58
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	int row, col;
	
	System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz.");
	System.out.println("Lütfen oynamak istediğiniz oyunun boyutları giriniz:(örn: satır 5, sutun 4)");
	System.out.print("Satır Sayısı : ");
	row = scan.nextInt();
	System.out.print("Sutun Sayısı : ");
	col = scan.nextInt();
	
	mineSweeper mine = new mineSweeper(row, col);
	mine.run();
	
	}


}
