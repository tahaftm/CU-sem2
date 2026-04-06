public class PrimitiveDatatype{
    public static void main(String[] args){
        // All the datatypes that have a defined size is known as Primitive Datatype
        long phoneNumber = 3357227859L;
        float marks = 76.676F;
        double pi = 3.14153678980;
        System.out.println(phoneNumber + " " + marks + " " + pi);

        int a = 5;
        int b = a;

        // In primitve datatype the variable creates a copy of the value not the link to the variable whos coppy is being made
        System.out.println("b: "+b);
        a = 7;
        System.out.println("b: "+b);
    }
}