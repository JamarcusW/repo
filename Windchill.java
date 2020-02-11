import java.util.Scanner;

public class Windchill {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	double tempInfar ,windmph , windChill ;
	
	System.out.println(" WindChill Calculator \n");
	
	System.out.println("Please enter the temperature in Fahrenheit (must be >= -45 and <= 40):");
	
	Scanner imput = new Scanner(System.in);
	

	
		
		
		tempInfar = imput.nextDouble();
		
			if (tempInfar < -45 || tempInfar > 40 )
				
			{
				
				System.out.println("Please enter valid temperature in Fahrenheit.(must be >= -45 and <= 40)\n");
				
				System.out.println("Programmer name: Jamarcus Orr Williams");
				
			}
			
			else 
				
			{
				
			System.out.println("Please enter the wind speed (must be >= 5 and <= 60):");
				
			Scanner imput2 = new Scanner(System.in);
		
			windmph = imput2.nextDouble();
	
				if ( windmph < 5 || windmph > 60 )
					
				{ 
					
					System.out.println("\nPlease enter valid wind speed.(must be >= 5 and <= 60): \n");
					
					System.out.println("Programmer name: Jamarcus Orr Williams");
					
				}
				
				else 
				
				{
					windChill = 35.74 + 0.6215* tempInfar + (0.4275* tempInfar - 35.75) * Math.pow(windmph , 0.16);
					
					System.out.println("\nThe Wind chill temperature is : "+ windChill + " degrees Fahrenheit.\n");
					
					System.out.println("Programmer name: Jamarcus Orr Williams\n");
					
				}
				
			
			
			}
	}

}
