public class Casting{
    public static void main(String[] args) {
        long a = 10;
        // int b = a;     // Error: incompatible types: possible lossy conversion from long to int(errors(1): 4:9-4:33)
        int b = (int) a;
        // byte > short > int > long > float > double

        int x = Integer.parseInt("5");
        System.out.println(x);
    }
}