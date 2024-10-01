package assignments_27;

public class Pattern7 {

	public static void main(String[] args) {
		int row = 6;
		int col = 1;
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				System.out.print("*");// for row
			}
			col++;
			System.out.println(" ");// for column
		}
	}
}
/*
* 
** 
*** 
****
*/