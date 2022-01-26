import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		Scanner myObject = new Scanner(System.in);
		// requesting the user to input their name both first and last and storing it in
		System.out.print("Enter your first name: ");
		String Fname = myObject.next();
		System.out.print("Enter your last name: ");
		String Lname = myObject.next();
		// requesting the user to input their weight which must be in kilograms
		System.out.print("Enter your weight in kg: ");
		float weight = myObject.nextFloat();
		// the height must be in meters
		System.out.print("Enter your height in meters: ");
		float height = myObject.nextFloat();
		// using the BMI formula to calculate the bmi of the user.
		float BMI = (weight / (height * height));
		//printing out the user's name with their calculated bmi 
		System.out.print("Hello " + Fname  + Lname + " your Body Mass Index (BMI) is " +BMI + "kg/m^2" );
		// TODO Auto-generated method stub
		if(BMI <18.5) {
			System.out.print(" underweight");
		}
		else if(BMI<25) {
			System.out.print(" Normal");
		}
		else if(BMI <30) {
			System.out.print(" Overweight");
		}
		else {
			System.out.print(" Obesity");
		}
		myObject.close();
	}

}
