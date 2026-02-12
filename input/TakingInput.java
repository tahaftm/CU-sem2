import java.util.Scanner;
public class TakingInput{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter length: ");
	int length = sc.nextInt();
	System.out.print("Enter bredth: ");
	int bredth = sc.nextInt();
	System.out.println("The area of rectangle with bredth " + (bredth) + " and length " + (length) + " is " + (length * bredth));
}
}