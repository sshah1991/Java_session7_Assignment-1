public class Assignment7_1 {
	public static void main(String args[]) {
		// Define a integer variable
		int number = -1854;
		System.out.println("The Integer before conversion is:"+number);
		
		
		String numberAsString = String.valueOf(number);
		
		//Print the converted string
		System.out.println("Converted string is : "+numberAsString);

		//Perform some operations on the converted string.
		System.out.println("First character of the string is: "+numberAsString.charAt(0));
		System.out.println("Length of the string is: "+numberAsString.length());
	}
}