public class Converter	{

// identifying variables needed for conversion 

	private int meters;
	private int inches;
	private int feet;
	private int yards;
	private String print = "";
	
// calling new method for conversion 
	
	public void setMeters (int m) {
		
		meters = m;
		
		double Total = (m * 39.37008);
		
		inches = (int) Math.round(Total);
		feet = inches / 12;
		inches = inches - (feet * 12);
		yards = feet / 3;
		feet = feet - (yards * 3);
	
		}
		
// defining the output	
	
	public String OutputImperial()  {
		
		// defining the output for yards
		
		if(yards > 0)	{
			if(yards == 1)	{
				print += (yards + " yard");
			}else{
				print += (yards + " yards");
			}
			if(feet > 0 && inches > 0) {
				print += " , ";
			}else if(feet > 0 || inches > 0){
				print +=" and ";
			}
		
		// defining the output for feet
			
		if(feet > 0) {
			if(feet == 1)	{
				print += (feet + " foot");
			}else{
				print += (feet + " feet");
			}
			if (inches > 0)		{
				print += " and ";
			}
			
		}
		
		// defining the output for inches 
		
		if(inches > 0){
			if(inches == 1){
				print += (inches + "inch");
			}else{
				print += (inches + " inches");
			}
		}
		
		
		}	
				return print;		

	}		

}