package assignments_27;

public class Pattern22 {

	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {

			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}

			for (int j = i + 1; j <= 6; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

	}

}
/*
1 2 3 4 5 6 
2 3 4 5 6 
 3 4 5 6 
  4 5 6 
   5 6 
    6 
*/