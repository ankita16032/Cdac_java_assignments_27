package assignments_27;

public class Pattern29 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
           
            for (int j = 0; j < 5; j++) {
                
                if (i == 0 || j == 0 || i == 5 - 1
                    || j == 5 - 1) {
                    System.out.print("*");
                }
                
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
		}
	}
}
/*
*****
*   *
*   *
*   *
*****
*/