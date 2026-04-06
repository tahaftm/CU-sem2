
import java.awt.Point;
import java.util.Date;

public class NonPrimitiveDatatype{
    public static void main(String[] args){
        // All the datatypes that does not have defined size is known as Non Primitive Datatype
        // An object in Java is an instance/example of a class that represents a real-world entity and contains:
        String newString = new String("This is a new text");
        Date newDate = new Date();


        // In non primitve datatype the variable creates a link to the variable whos coppy is being made
        Point a = new Point(1,5);
        System.out.println(a);
        a.x = 3;
        System.out.println(a);
    }
}