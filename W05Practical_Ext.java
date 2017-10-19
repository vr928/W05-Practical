import java.text.DecimalFormat;

public class W05Practical_Ext {

	public static void main(String args[]) {
		
		
		EasyIn2 reader = new EasyIn2();

		
		
		DecimalFormat d = new DecimalFormat("#.000");
		
		
		
		System.out.println("Enter number of yards in the distance you want to convert: ");
		
		int yards = reader.getInt();
		
		if (yards < 0) System.out.println("Sorry, negative numbers not allowed");
		
		System.out.println("Enter number of feet in the distance you want to convert: ");
		
		int feet = reader.getInt();
		
		if (feet < 0) System.out.println("Sorry, negative numbers not allowed");
		
		System.out.println("Enter number of inches in the distance you want to convert: ");
		
		int inches = reader.getInt();
		
		if (inches < 0) System.out.println("Sorry, negative numbers not allowed");
		
		
		
		Converter_Ext c = new Converter_Ext();
		
		System.out.println("In meters, " + yards + " yards, " + feet + " feet and " + inches + " inches would be - " + d.format(c.setImperial(yards, feet, inches)));
		
		
	}
		
}