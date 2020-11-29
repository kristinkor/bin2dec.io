package assignment7_korzhenevskaya;


/* PROGRAM: NumberFormatExceptionDemo.java
 * Written by Kristina Korzhenevskaya. 
 * Created: 11/16/2020.
 * Write and test a bin2Dec(String binaryString) method to convert a binary string into a decimal number.
 *  Implement the bin2Dec method to throw a NumberFormatException if the string is not a binary string. 
*/


public class NumberFormatExceptionDemo {
	
	/** The union bin2Dec converts binary String to decimal number
	* @param binaryString 
	* */
	public static void bin2Dec(String binaryString) {
		int decimal = 0;
		try {
			// converts the String to int using base two
			decimal=Integer.parseInt(binaryString,2);  
			System.out.println(decimal); 
			 
		}
		//The exception indicates that the application has attempted to convert a string to one of the numeric types,
		//but that the string does not have the appropriate format
		catch(NumberFormatException ex) {
			System.out.println("Exception: this is not a binary string ");
		}		
	}

	public static void main(String[] args) {
		//test binary and non-binary Strings
		String binaryString = "00110011";
		String nonBinaryString = "123456789";
		bin2Dec(binaryString); 
		bin2Dec(nonBinaryString); 
	}
}
