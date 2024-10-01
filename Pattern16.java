package assignments_27;

public class Pattern16 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {

				System.out.print(j);// for row
			}

			System.out.println(" ");// for column
		}

	}

}
/*
54321 
5432 
543 
54 
5 
*/