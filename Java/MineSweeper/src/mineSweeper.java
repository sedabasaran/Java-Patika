import java.util.Random;
import java.util.Scanner;

public class mineSweeper {
	
	int rowNumber,colNumber,size;
	int [][] map; //mayınların nerede tutulduğunu bildiğimiz tarla
	int [][] board;//boş tarla - kullanıcının oynadığı
	boolean game = true;
	
	Random random = new Random(); //mayınları random yerleşt.
	Scanner scan =  new Scanner(System.in);
	
	mineSweeper(int rowNumber, int colNumber) {
		this.rowNumber = rowNumber;
		this.colNumber = colNumber;
		this.map = new int[rowNumber][colNumber];
		this.board = new int[rowNumber][colNumber];
		this.size = rowNumber * colNumber;				
	}
	
	public void run() {
		int row,col,success = 0;
		prepareGame();
		System.out.println("---------------");
		System.out.println("oyun başladı");

		while(game) {
			print(board);
			System.out.println(" ");
			System.out.print("Satır : ");
			row = scan.nextInt();
			System.out.print("Sutun : ");
			col = scan.nextInt();
			
			if(row < 0 || row >= rowNumber) {
				System.out.println("Geçersiz koordinat girdiniz");
				continue;
			}
			
			if(col < 0 || col >= colNumber) {
				System.out.println("Geçersiz koordinat girdiniz");
				continue;
			}
			
			if(map[row][col] != -1) {
				check(row,col);
				success++;
				if(success == (size - (size / 4))) {
					System.out.println("Başarılı, Hİçbir Mayına Basmadınız.");
					break;
				}
			}else {
				 game = false;
				 System.out.println("---------------");
				 System.out.println("---GAME OVER---");
				 System.out.println("---------------");		 
				 System.out.println("Mayınların Konumu ");
				 print(map);
			}
		}	
	}
	
	public void check(int row, int col) {
		if(board[row][col] == 0) {
			if((col < colNumber -1) && (map[row][col+1] == -1)) {
				board[row][col]++;
			}
			if((row < rowNumber-1) && (map[row+1][col] == -1)) {
				board[row][col]++;
			}
			if((row > 0) && (map[row-1][col] == -1)) {
				board[row][col]++;	
			}
			if((col > 0)&& (map[row][col-1] == -1)) {
				board[row][col]++;
			}
			if(board[row][col] == 0) {
				board[row][col] = -2;
			}
		}
	}
	
	//rastgele mayin oluşturcağız
	public void prepareGame() {
		int randomRow, randomCol, count = 0;
		while(count != (size / 4)) {
			randomRow = random.nextInt(rowNumber);
			randomCol = random.nextInt(colNumber);
			if(map[randomRow][randomCol] !=-1) {
				map[randomRow][randomCol] = -1;
				count++;
			}
		}
		
	}
	
	// Tarlanın mayınlı konumunu ekrana yazdırma
	public void print(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] >= 0 )
					System.out.print(" ");
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
	
}
