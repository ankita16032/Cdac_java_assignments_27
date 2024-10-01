package assignments_27;

public class Pattern17 {

	public static void main(String[] args) {
		int col = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(i+j);// for row
			}
			col++;
			System.out.println(" ");
		}
	}
}
/*
1 
23 
345 
4567 
56789 
*/