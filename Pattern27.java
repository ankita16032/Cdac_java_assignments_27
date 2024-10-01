package assignments_27;

public class Pattern27 {

	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (j == i || j == (7 - 1 - i)) {
					System.out.print("*  ");
				} else {
					System.out.print("     ");
				}
			}
			System.out.println();
		}

	}
}
/*
 
 
*                    *  
   *              *       
      *       *            
          *                 
      *       *            
   *              *       
*                     *  

*/