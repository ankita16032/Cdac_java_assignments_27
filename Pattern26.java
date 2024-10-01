package assignments_27;

public class Pattern26 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j)
					System.out.print("X" + " ");
				else
					System.out.print("-" + " ");
			}
			System.out.println();
		}

	}

}
/*
X - - - - 
- X - - - 
- - X - - 
- - - X - 
- - - - X 
*/
