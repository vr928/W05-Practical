public class Converter_Ext	{
	
	
// identifying variables needed for conversion 

	private int meters;
	private int inches;
	private int feet;
	private int yards;
	private String print = "";
	
// calling new method for conversion 
	
	public double setImperial(int yards, int feet, int inches) {
		
		int totalInches = (yards * 36) + (feet * 12) + (inches);
		
		double totalMeters = (totalInches/39.37008);
		
				return totalMeters;		

	}		

}