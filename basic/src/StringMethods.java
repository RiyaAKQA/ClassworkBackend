/**
 * 
 */

/**
 * @author riya.grover
 *
 */
public class StringMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("Enter a sentence");
		
		String sentence = input.nextLine();
		
		int letterCount , spaceCount , numberCount , otherCount ; 
		letterCount = spaceCount = numberCount = otherCount= 0;
		
		for ( int index = 0 ; index < sentence.length() ; index++) {
			if (Character.isLetter(sentence.charAt(index)))  ++letterCount;
			else if (Character.isDigit(sentence.charAt(index)))  ++numberCount;
			else if (sentence.charAt(index) == ' ')  ++spaceCount;
			else ++otherCount;
			
		}
		
		System.out.println("Letters in the sentence " + letterCount );
		System.out.println("Digits in the sentence " + numberCount);
		System.out.println("Spaces in the sentence " + spaceCount);
		System.out.println("Others in the sentence " + otherCount);
		
	input.close();

	} 

}
