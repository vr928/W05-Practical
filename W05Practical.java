public class W05Practical {
	public static void main(String args[]) {
		
		EasyIn2 reader = new EasyIn2();
		// asking for user input in metres
		System.out.println("Enter distance in metres: ");
		int i = reader.getInt();
		// validating input
		if (i < 0) System.out.println("Sorry, negative numbers are not allowed");
		// using converter class to perform conversion
		Converter C = new Converter();
		C.setMeters(i);
		// printing out result
		System.out.println(C.OutputImperial());
	}
}