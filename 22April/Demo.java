public class Demo{
    public static void main(String[] args) {
        Shape r1 = new Rectangle();
        Shape r2 = new Rectangle();
        Shape r3 = new Rectangle();
        Shape r4 = new Rectangle();
        Shape r5 = new Pentagon();
        Shape r6 = new Pentagon();

        Shape[] shapes = {r1,r2,r3,r4,r5,r6};
        for (Shape s : shapes) {
            s.move(2, 3);
        }

        Utils.drawShapes(shapes);
        System.err.println("===============================================================");
        System.err.println("Move only rectangles");
        // Move only rectangles
        for (Shape s : shapes) {
            if (s instanceof Rectangle)
                s.move(2, 3);
        }

    }
}