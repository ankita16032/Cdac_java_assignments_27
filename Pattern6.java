package assignments_27;

public class Pattern6 {

	public static void main(String[] args) {
		char a = 'A';
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print((char) (a + i + j));// for row
			}
			System.out.println(" ");
		}

	}

}
/*
ABCD 
BCDE 
CDEF 
DEFG 
*/