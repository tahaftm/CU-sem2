public class RectangleTest{
	public static void main(String[] args){

		// ---------------------------------------------------------- r1 ----------------------------------------------------------------------- 
		Rectangle r1 = new Rectangle();
		// Showing Specifications
		System.out.println("r1 Specifications: ");
		r1.length = 10;
		r1.bredth = 100;
		System.out.println("Length: " + (r1.length));
		System.out.println("Bredth: " + (r1.bredth));

		// Printing address
		System.out.println(r1);
			
		// Using methods of the class
		double area1 = r1.show_area();
		System.out.println("Area of rectangle 1: " + (area1));
		double perimeter1 = r1.show_parameter();
		System.out.println("Parameter of rectangle 1: " + (perimeter1));

		System.out.println();
		System.out.println();

		// ---------------------------------------------------------- r2 -----------------------------------------------------------------------

		Rectangle r2= new Rectangle();

		// Showing Specifications
		System.out.println("r2 Specifications: ");
		r2.length = 20;
		r2.bredth = 10;
		System.out.println("Length: " + (r2.length));
		System.out.println("Bredth: " + (r2.bredth));
		
		// Printing address
		System.out.println(r2);

		// Using methods of the class
		double area2 = r2.show_area();
		System.out.println("Area of rectangle 2: " + (area2));
		double perimeter2 = r2.show_parameter();
		System.out.println("Parameter of rectangle 2: " + (perimeter2));
}
}