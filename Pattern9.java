package assignments_27;

public class Pattern9 {

	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);// for row
			}

			System.out.println(" ");// for column
		}

	}

}
/*
1 
12 
123 
1234 
12345 
*/