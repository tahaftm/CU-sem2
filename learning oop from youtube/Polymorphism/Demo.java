// Polymorphism means same method but with different arguments

public class Demo{
    public static void main(String[] args) {
        System.out.println("Sum is: " + add(2,4));
        System.out.println("Sum is: " + add(3,4,6));
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
}