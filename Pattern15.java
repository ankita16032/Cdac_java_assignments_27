package assignments_27;

public class Pattern15 {

	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {

				System.out.print(i);// for row
			}

			System.out.println(" ");// for column
		}

	}

}
/*
55555 
4444 
333 
22 
1 
*/