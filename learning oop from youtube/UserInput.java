
import java.util.Scanner;

public class UserInput{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        // .next() ----> Take one word
        // .nextLine() ----> Take one line
        System.out.println(name);
    }
}