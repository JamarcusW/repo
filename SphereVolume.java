import java.util.Scanner;

public class SphereVolume 
{ 
public static void main(String[] args) 
{ 
// add your declaration and code here 
	
	double diam = 0, radi ,vol ;
	
	System.out.println( "The purpose of this program is to calculate the volume of spheres. \n" );
	
	System.out.println( "Please enter the diameter of the sphere : ");
	
	Scanner myObj = new Scanner(System.in);	
	
	diam = myObj.nextDouble();
	
	radi = diam /2;
	
	vol = (4.0/3)*Math.PI*Math.pow(radi, 3);
	
	System.out.println("The volume of the sphere is "+ vol + ".");
	
	System.out.println("Programmer name: Jamarcus orr Williams ");
	
} 
} 
