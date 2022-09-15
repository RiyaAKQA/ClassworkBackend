
public class DiceGame {
	
	 
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("How many times to roll the dice? ");
		int[] faces = {0,0,0,0,0,0};
		int limit = input.nextInt();
		while (limit > 0) {
			
	    ++faces[(int)Math.random() * 6];
	    --limit;

 }
		int face = 1; 
		
		for ( int count : faces ) {
			System.out.printf("%2d : %5d :: " , face++, count++);
			for (int each = 1; each <= count ; each++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		input.close();
}
}
