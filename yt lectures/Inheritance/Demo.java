public class Demo{
    public static void main(String[] args) {
        // Asub child = new Asub();

        // child.hello();               // Basic Concepts

        // A child_through_parent = new Asub();
        // child_through_parent.hello();           // When child is created with the datatype of its parent


        A child_through_parent = new Asub();
        A.hello_static();
        Asub.hello_static();
    }
}