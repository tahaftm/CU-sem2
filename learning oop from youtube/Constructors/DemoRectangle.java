public class DemoRectangle{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(3,6);           // As soon as the new object is created the constructor is called automatically

        rect.draw();
        rect.printArea();
    }
}