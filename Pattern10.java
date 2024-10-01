package assignments_27;

public class Pattern10 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print((int) ( i + j) % 2);// for row
			}
			System.out.println(" ");
		}
	}

}
/*
0101 
1010 
0101 
1010 
*/