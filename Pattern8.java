package assignments_27;

public class Pattern8 {

	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);// for row
			}

			System.out.println(" ");// for column
		}

	}

}
/*
1 
22 
333 
4444 
55555 
*/