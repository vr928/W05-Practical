public class W05Practical {

	public static void main(String args[]) {
		
		EasyIn2 reader = new EasyIn2();
	
		System.out.println("Enter distance in metres: ");
	
		int i = reader.getInt();
		
		if (i < 0) System.out.println("Sorry, negative numbers are not allowed");
		
		Converter C = new Converter();
		
		C.setMeters(i);
		
		System.out.println(C.OutputImperial());
		
	}

}