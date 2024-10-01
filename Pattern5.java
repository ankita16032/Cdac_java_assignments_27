package assignments_27;

public class Pattern5 {

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.print(j % 2);// for row
			}
			System.out.println(" ");// for column
		}
	}

}
/*
1010 
1010 
1010 
1010 
*/