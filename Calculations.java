import java.util.Scanner;
public class Calculations {

	public static void main(String[] args) {
		 // declare variables 
        double length = 0.0;
        double width = 0.0;
        double area = 0.0;
        double perimeter = 0.0; 

        // create Scanner class object to read input
        Scanner myObject = new Scanner(System.in);

        // read input
        System.out.print("Enter length of the rectangle: ");
        length = myObject.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        width = myObject.nextDouble();

        // calculate area
        area = length * width;
        // display results for the area of the rectangle
        System.out.format("The area of the rectangle using double data type is = %.4f", area);
        // calculate the perimeter
        perimeter = 2*(length + width);
        // display result for the perimeter of the rectangle
        System.out.format("\nThe perimeter of the rectangle using double data type is = %.4f", perimeter);
        // close Scanner class object
        myObject.close();
	}

}
