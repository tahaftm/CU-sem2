public class Demo{
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        c1.draw();
        c1.printArea();

        Rectangle r1 = new Rectangle(4,5);
        r1.draw();
        r1.printArea();

        // creating object with the help of parent class
        Shape c2 = new Circle(4);
        c2.draw();
        c2.printArea();

        Shape r2 = new Rectangle(4,3);
        r2.draw();
        r2.printArea();
    }
}