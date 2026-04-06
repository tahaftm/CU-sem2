import java.util.Scanner;
public class Calculator{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter first number: ");
	double num1 = sc.nextDouble();
	System.out.print("Enter second number: ");
	double num2 = sc.nextDouble();
	System.out.print("Enter operator : ");
	char op = sc.next().charAt(0);
	System.out.print("num1 : " + (num1));
	System.out.print("num2 : " + (num2));
	System.out.print("operator : " + (op));
	double answer;
	switch(op){
		case '+':
			answer = num1 + num2;
			break;
		case '-':
			answer = num1 - num2;
			break;
		case '/':
			answer = num1 / num2;
			break;
		case '*':
			answer = num1 * num2;
			break;
   		default:
        		System.out.println("Invalid operator!");
        		return;  
	}
	System.out.print("Answer : " + (answer));
}
}