import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		final double PI = 3.14159;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter distance to target.\n");
		double d = reader.nextDouble();
		System.out.println("Enter the height of the battery relative to the water\n");
		double h = reader.nextDouble();
		System.out.println("Enter the intitial velocity of the shell\n");
		double v = reader.nextDouble();
		
		System.out.println("Distance is " + d);
		System.out.println("Height is " + h);
		System.out.println("Initial velocity of the shell is " + v);
		
		double a = -4.9*(d/v)*(d/v);
		// or use double a = -4.9*Math.pow((d/v), 2); for exponent.
		double b = d;
		double c = a + h;
		
		//what our a,b,c makes up so far
		System.out.println("Here is the quadratic formula so far:\n");
		System.out.println("Where X = tanTheta");
		System.out.println(a + "x^2 " + b + "x " + c + " = 0\n");
		
		//we only want the lower angle, which comes from the positive sign in the quadratic formula
		double tanTheta = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
		//we now have tanTheta, now we need to use arctan to find the theta
		
		//Now using inverse tan to find its theta
		double lowestAngle = Math.atan(tanTheta)*(180/PI);
		System.out.println("Lowest angle: " + lowestAngle);
		//Need to multiply by 180/pi since our answer was in radians
	}
}
