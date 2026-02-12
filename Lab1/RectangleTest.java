public class RectangleTest{
	public static void main(String[] args){
		Rectangle r1 = new Rectangle();
		System.out.println("r1 Specifications: ");
		r1.length = 10;
		r1.bredth = 100;
		System.out.println("Length: " + (r1.length));
		System.out.println("Bredth: " + (r1.bredth));
		System.out.println();
		System.out.println();
		Rectangle r2= new Rectangle();
		System.out.println("r2 Specifications: ");
		r2.length = 20;
		r2.bredth = 10;
		System.out.println("Length: " + (r2.length));
		System.out.println("Bredth: " + (r2.bredth));
		System.out.println(r2);
}
}