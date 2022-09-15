/**
 * 
 */

/**
 * @author riya.grover
 *
 */
public class Matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int[][] matrixA = new int [3][3];
		int [][] matrixB = new int[3][3];
		
		System.out.println("Enter the values for Matrix A ");
		
		for (int rows = 0 ; rows < matrixA.length; ++rows) {
			for (int cols = 0 ; cols < matrixA[rows].length ; ++cols) {
				System.out.printf("Row %d , Col %d ?", rows+1 , cols+1 );
				matrixA[rows][cols] = input.nextInt();
			}
		}
		System.out.println();
		
		System.out.println("Enter the values for Matrix B ");
		
		for (int rows = 0 ; rows < matrixB.length; ++rows) {
			for (int cols = 0 ; cols < matrixB[rows].length ; ++cols) {
				System.out.printf("Row %d , Col %d?", rows+1 , cols+1 );
				matrixB[rows][cols] = input.nextInt();
			}
		}
		System.out.println();
		
	  int [][] matrixR = new int [3][3];
	  for (int rows = 0 ; rows < matrixA.length ; ++rows) {
		  for ( int cols = 0; cols < matrixA[rows].length ; ++cols) {

				matrixR[rows][cols] = matrixA[rows][cols] + matrixB[rows][cols];
				System.out.println();
		  }
	  }
	  
	  System.out.println("Matrix A");
	  

		for (int rows = 0 ; rows < matrixA.length; ++rows) {
			for (int cols = 0 ; cols < matrixA[rows].length ; ++cols) {
				
				System.out.println();
				
			}
		}
	  

	}

}
