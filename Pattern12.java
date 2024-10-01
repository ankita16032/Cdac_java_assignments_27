package assignments_27;

public class Pattern12 {

	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j % 2);// for row
			}

			System.out.println(" ");// for column
		}
	}
}
/*
1 
10 
101 
1010 
10101
*/